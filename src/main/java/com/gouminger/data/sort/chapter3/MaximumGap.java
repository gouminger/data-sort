package com.gouminger.data.sort.chapter3;

import java.util.Arrays;

//最大间距
public class MaximumGap {

    /**
     * 给定一个无序的数组nums，返回 数组在排序之后，相邻元素之间最大的差值 。如果数组元素个数小于 2，则返回 0 。
     * 您必须编写一个在「线性时间」内运行并使用「线性额外空间」的算法。
     */
    public static void main(String[] args) {
        int[] nums = new int[]{3,6,9,1};
        System.out.println(maximumGap(nums));

        nums = new int[]{10};
        System.out.println(maximumGap(nums));
    }

    public static int maximumGap(int[] nums) {
        int[] counts = new int[10];
        long a = 10, b = 1;
        for (int i=0; i<10; i++) {
            for (int num : nums) {
                int n = (int) ((num % a) / b);
                counts[n]++;
            }
            int cnt = 0, t;
            for (int j=0; j<counts.length; j++) {
                if (counts[j] > 0) {
                    t = counts[j];
                    counts[j] = cnt;
                    cnt += t;
                }
            }
            int[] result = new int[nums.length];
            for (int num : nums) {
                int n = (int) ((num % a) / b);
                result[counts[n]] = num;
                counts[n]++;
            }
            System.arraycopy(result, 0, nums, 0, nums.length);
            Arrays.fill(counts, 0);
            a = 10 * a;
            b = 10 * b;
        }
        int max = 0;
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i+1] - nums[i] > max) {
                max = nums[i+1] - nums[i];
            }
        }
        return max;
    }
}
