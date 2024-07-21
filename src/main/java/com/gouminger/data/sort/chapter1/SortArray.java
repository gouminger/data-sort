package com.gouminger.data.sort.chapter1;

import java.util.Arrays;

//排序数组
public class SortArray {

    /**
     * 给你一个整数数组 nums，请你将该数组升序排列。
     */
    public static void main(String[] args) {
        int[] nums = new int[]{5, 2, 3, 1};
        System.out.println(Arrays.toString(sortArray(nums)));

        nums = new int[]{5,1,1,2,0,0};
        System.out.println(Arrays.toString(sortArray(nums)));
    }

    public static int[] sortArray(int[] nums) {
        int t, j;
        for (int i=1; i<nums.length; i++) {
            t = nums[i];
            j = i-1;
            while (j >= 0 && t < nums[j]) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = t;
        }
        return nums;
    }
}
