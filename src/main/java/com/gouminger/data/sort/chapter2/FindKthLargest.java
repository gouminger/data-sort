package com.gouminger.data.sort.chapter2;

//数组中的第 K 个最大元素
public class FindKthLargest {

    /**
     * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
     * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
     * 你必须设计并实现时间复杂度为 O(n) 的算法解决此问题。
     */
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(arr, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        int[] arr = new int[20001];
        for (int num : nums) {
            arr[num+10000]++;
        }
        int sum = 0;
        for (int i=arr.length-1; i>=0; i--) {
            sum += arr[i];
            if (sum >= k) {
                return i-10000;
            }
        }
        return -1;
    }

    //堆排序-构建最小堆
    public static void buildMinHeap (int[] arr) {
        for (int i=arr.length/2-1; i>=0; i--) {
            buildNode(arr, i);
        }
    }

    public static void buildNode (int[] arr, int i) {
        if (i > arr.length/2-1) {
            return;
        }
        int rootIndex = i;
        int childLeftIndex = 2*i+1;
        int childRightIndex = 2*i+2;
        if (arr[childLeftIndex] < arr[rootIndex]) {
            rootIndex = childLeftIndex;
        }
        if (arr[childRightIndex] < arr[rootIndex]) {
            rootIndex = childRightIndex;
        }
        if (rootIndex != i) {
            arr[i] = arr[i] ^ arr[rootIndex];
            arr[rootIndex] = arr[i] ^ arr[rootIndex];
            arr[i] = arr[i] ^ arr[rootIndex];

            buildNode(arr, rootIndex);
        }
    }
}
