package com.gouminger.data.sort.chapter2;

import java.util.Arrays;

// 排序数组
public class QuickSort {

    /**
     * 给你一个整数数组 nums，请你将该数组升序排列。
     */
    public static void main(String[] args) {
        int[] nums = new int[]{5,2,3,1};
        System.out.println(Arrays.toString(sortArray(nums)));

        nums = new int[]{5,1,1,2,0,0};
        System.out.println(Arrays.toString(sortArray(nums)));
    }

    public static int[] sortArray(int[] nums) {
        boolean isSort = true;
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] > nums[i+1]) {
                isSort = false;
            }
        }
        if (!isSort) {
            quickSort(nums, 0, nums.length-1, 0);
        }
        return nums;
    }

    public static void quickSort (int[] nums, int start, int end, int idx) {
        if (start >= end) {
            return;
        }

        int t = end;
        for (int i=start; i<=t; i++) {
            if (nums[idx] < nums[i]) {
                if (i != t) {
                    nums[i] = nums[i] ^ nums[t];
                    nums[t] = nums[i] ^ nums[t];
                    nums[i] = nums[i] ^ nums[t];
                    i--;
                }
                t--;
            }
        }
        if (idx != t) {
            nums[idx] = nums[idx] ^ nums[t];
            nums[t] = nums[idx] ^ nums[t];
            nums[idx] = nums[idx] ^ nums[t];
        }

        quickSort(nums, start, t-1, start);
        quickSort(nums, t+1, end, t+1);
    }

    public static void quickSort2 (int[] nums, int start, int end, int idx) {
        if (start >= end) {
            return;
        }

        int startF = start, endF = end;
        while (start <= end) {
            if (nums[start] <= nums[idx]) {
                start++;
                continue;
            }
            if (nums[end] >= nums[idx]) {
                end--;
                continue;
            }
            nums[start] = nums[start] ^ nums[end];
            nums[end] = nums[start] ^ nums[end];
            nums[start] = nums[start] ^ nums[end];
            start++;
            end--;
        }
        if (idx != end) {
            nums[idx] = nums[idx] ^ nums[end];
            nums[end] = nums[idx] ^ nums[end];
            nums[idx] = nums[idx] ^ nums[end];
        }

        quickSort2(nums, startF, end-1, startF);
        quickSort2(nums, end+1, endF, end+1);
    }
}
