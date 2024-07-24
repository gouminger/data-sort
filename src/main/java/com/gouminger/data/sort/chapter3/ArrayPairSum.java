package com.gouminger.data.sort.chapter3;

//数组拆分 I
public class ArrayPairSum {

    /**
     * 给定长度为2n的整数数组 nums ，你的任务是将这些数分成n 对,
     * 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从 1 到n 的 min(ai, bi) 总和最大。
     * 返回该 最大总和 。
     */
    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 3, 2};
        System.out.println(arrayPairSum(nums));

        nums = new int[]{6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums));
    }

    public static int arrayPairSum(int[] nums) {
        int[] counts = new int[20001];
        for (int num : nums) {
            counts[num+10000]++;
        }
        boolean add = true;
        int sum = 0;
        for (int i=0; i<20001; i++) {
            if (counts[i] > 0) {
                if (add) {
                    sum += (i-10000);
                    counts[i]--;
                    i--;
                    add = false;
                } else {
                    counts[i]--;
                    i--;
                    add = true;
                }
            }
        }
        return sum;
    }
}
