package com.gouminger.data.sort.chapter3;

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
        int[] counting = new int[100001];
        for (int num : nums) {
            counting[num+50000]++;
        }
        int cnt = 0, t;
        for (int i=0; i<counting.length; i++) {
            t = counting[i];
            counting[i]=cnt;
            cnt+=t;
        }
        int[] result = new int[nums.length];
        for (int num : nums) {
            result[counting[num+50000]++] = num;
        }
        return result;
    }
}
