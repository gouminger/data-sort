package com.gouminger.data.sort.chapter3;

//高度检查器
public class HeightChecker {

    /**
     * 学校打算为全体学生拍一张年度纪念照。根据要求，学生需要按照 非递减 的高度顺序排成一行。
     * 排序后的高度情况用整数数组 expected 表示，其中 expected[i] 是预计排在这一行中第 i 位的学生的高度（下标从 0 开始）。
     * 给你一个整数数组 heights ，表示 当前学生站位 的高度情况。heights[i] 是这一行中第 i 位学生的高度（下标从 0 开始）。
     * 返回满足 heights[i] != expected[i] 的 下标数量 。
     */
    public static void main(String[] args) {
        int[] heights = new int[]{1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(heights));

        heights = new int[]{5,1,2,3,4};
        System.out.println(heightChecker(heights));

        heights = new int[]{1,2,3,4,5};
        System.out.println(heightChecker(heights));

        heights = new int[]{31,81,41,78,48,2,83,48,21,20,43,15,26,78,96,55,5,46,35,89,85,54,76,64,71,36,98,94,100,7,88,92,80,43,24,89,50,61,59,20,94,57,99,62,82,46,28,57,66,62,56,15,12,63,19,35,12,26,15,59,8,44,46,45,33,20,27,31,85,15,92,63,63,40,35,95,91,1,4,57,55,68,53,28,15,94,74,89,77,7,25,63,77,24,76,44};
        System.out.println(heightChecker(heights));
    }

    public static int heightChecker(int[] heights) {
        int[] standard = new int[100];
        for (int height : heights) {
            standard[height-1]++;
        }
        int result = 0, idx = 0;
        for (int height : heights) {
            while (standard[idx] == 0) {
                idx++;
            }
            if (height != (idx+1)) {
                result++;
            }
            standard[idx]--;
        }
        return result;
    }
}
