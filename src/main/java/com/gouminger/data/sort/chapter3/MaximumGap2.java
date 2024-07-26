package com.gouminger.data.sort.chapter3;

//最大间距
public class MaximumGap2 {

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
        int bucketNums = 100;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        int step = (max - min) / bucketNums;
        if (((max - min) % bucketNums) != 0) {
            step++;
        }
        if (step == 0) {
            return 0;
        }
        int[][] table = new int[bucketNums][nums.length];
        int[] bucketLength = new int[bucketNums];
        for (int num : nums) {
            int rowNumber = (num - min) / step;
            table[rowNumber][bucketLength[rowNumber]++] = num;
        }

        for (int i=0; i<table.length; i++) {
            if (bucketLength[i] == 0) {
                continue;
            }
            int[] counting = new int[step];
            for (int k=0; k<bucketLength[i]; k++) {
                counting[table[i][k]-step*(i+1)]++;
            }
            int s = 0, t;
            for (int j=0; j<counting.length; j++) {
                t = counting[j];
                counting[j] = s;
                s+=t;
            }
            int[] row = new int[bucketLength[i]];
            for (int k=0; k<bucketLength[i]; k++) {
                row[counting[table[i][k]-step*(i+1)]] = table[i][k];
                counting[table[i][k]-step*(i+1)]++;
            }
            table[i] = row;
        }

        int idx = 0;
        for (int i=0; i<table.length; i++) {
            if (bucketLength[i] == 0) {
                continue;
            }
            System.arraycopy(table[i], 0, nums, idx, bucketLength[i]);
            idx+=bucketLength[i];
        }
        int result = 0;
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i+1] - nums[i] > result) {
                result = nums[i+1] - nums[i];
            }
        }
        return result;
    }
}
