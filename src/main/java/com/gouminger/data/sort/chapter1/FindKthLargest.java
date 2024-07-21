package com.gouminger.data.sort.chapter1;

//数组中的第 K 个最大元素
public class FindKthLargest {

    /**
     * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
     * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
     * 你必须设计并实现时间复杂度为 O(n) 的算法解决此问题。
     */
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));

        nums = new int[]{3,2,3,1,2,4,5,5,6};
        k = 4;
        System.out.println(findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        int[] arr = new int[200001];
        for (int i=0; i<nums.length; i++) {
            arr[nums[i]+10000]++;
        }
        int idx = 0;
        for (int i=arr.length-1; i>0; i--) {
            idx += arr[i];
            if (idx >= k) {
                return i - 10000;
            }
        }
        return -1;
    }

    public static int findKthLargest1(int[] nums, int k) {
        Heap heap = new Heap(k);
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > heap.getMin()) {
                heap.add(nums[i]);
            }
        }
        return heap.getMin();
    }

    public static class Heap {
        private int[] arr;
        private int idx;
        private int min;
        public Heap(int size) {
            arr = new int[size];
            idx = 0;
            min = Integer.MAX_VALUE;
        }
        public void add (int num) {
            if (idx < arr.length) {
                arr[idx++] = num;
                if (num < min) {
                    min = num;
                }
            } else {
                boolean swap = true;
                int t = min;
                min = Integer.MAX_VALUE;
                for (int i=0; i<arr.length; i++) {
                    if (arr[i] == t && swap) {
                        swap = false;
                        arr[i] = num;
                    }
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                }
            }

        }
        public int getMin () {
            if (idx < arr.length) {
                return Integer.MIN_VALUE;
            }
            return this.min;
        }
    }
}
