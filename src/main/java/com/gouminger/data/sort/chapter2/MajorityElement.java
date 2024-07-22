package com.gouminger.data.sort.chapter2;

//多数元素
public class MajorityElement {

    /**
     * 给定一个大小为 n 的数组nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于⌊ n/2 ⌋的元素。
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     */
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3};
        System.out.println(majorityElement(nums));

        nums = new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        sortLeft(nums);
        sortRight(nums);
        return nums[nums.length/2];
    }

    public static void sortLeft(int[] nums) {
        int start = 0;
        int end = nums.length/2;
        int maxIdx = start;
        for (int i=start; i<=end; i++) {
            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }
        if (end != maxIdx) {
            nums[maxIdx] = nums[maxIdx] ^ nums[end];
            nums[end] = nums[maxIdx] ^ nums[end];
            nums[maxIdx] = nums[maxIdx] ^ nums[end];
            sortRight(nums);
        }
    }

    public static void sortRight(int[] nums) {
        int start = nums.length/2;
        int end = nums.length-1;
        int minIdx = start;
        for (int i=start; i<=end; i++) {
            if (nums[i] < nums[minIdx]) {
                minIdx = i;
            }
        }
        if (start != minIdx) {
            nums[minIdx] = nums[minIdx] ^ nums[start];
            nums[start] = nums[minIdx] ^ nums[start];
            nums[minIdx] = nums[minIdx] ^ nums[start];
            sortLeft(nums);
        }
    }
}
