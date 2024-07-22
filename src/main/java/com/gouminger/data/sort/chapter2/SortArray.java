package com.gouminger.data.sort.chapter2;

import java.util.Arrays;

//排序数组
public class SortArray {

    /**
     * 给你一个整数数组 nums，请你将该数组升序排列。
     */
    public static void main(String[] args) {
        int[] arr = new int[]{84,83,88,87,61,50,70,60,80,99};
        System.out.println(Arrays.toString(sortArray(arr)));
    }

    public static int[] sortArray(int[] nums) {
        for (int gap=nums.length/2; gap>0; gap=gap/2) {
            for (int i=0; i<gap; i++) {
                for (int j=i;j<nums.length;j+=gap) {
                    int num = nums[j];
                    int numIdx = j;
                    while (numIdx>=gap && num<nums[numIdx-gap]) {
                        nums[numIdx] = nums[numIdx-gap];
                        numIdx = numIdx-gap;
                    }
                    nums[numIdx] = num;
                }
            }
        }
        return nums;
    }
}
