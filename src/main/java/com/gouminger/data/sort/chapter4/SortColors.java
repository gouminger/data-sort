package com.gouminger.data.sort.chapter4;

import java.util.Arrays;

//颜色分类
public class SortColors {

    /**
     * 给定一个包含红色、白色和蓝色、共n 个元素的数组nums，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
     * 我们使用整数 0、1 和 2 分别表示红色、白色和蓝色。
     * 必须在不使用库内置的 sort 函数的情况下解决这个问题。
     */
    public static void main(String[] args) {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{2, 0, 1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int[] standard = new int[3];
        for (int num : nums) {
            standard[num]++;
        }
        int idx = 0;
        for (int i=0; i<nums.length; i++) {
            while (standard[idx] == 0) {
                idx++;
            }
            nums[i] = idx;
            standard[idx]--;
        }
    }
}
