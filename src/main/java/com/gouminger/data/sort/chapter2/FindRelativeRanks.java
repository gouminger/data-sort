package com.gouminger.data.sort.chapter2;

import java.util.Arrays;

//相对名次
public class FindRelativeRanks {

    /**
     * 给你一个长度为 n 的整数数组 score ，其中 score[i] 是第 i 位运动员在比赛中的得分。所有得分都 互不相同 。
     * 运动员将根据得分 决定名次 ，其中名次第 1 的运动员得分最高，名次第 2 的运动员得分第 2 高，依此类推。运动员的名次决定了他们的获奖情况：
     * 名次第 1 的运动员获金牌 "Gold Medal" 。
     * 名次第 2 的运动员获银牌 "Silver Medal" 。
     * 名次第 3 的运动员获铜牌 "Bronze Medal" 。
     * 从名次第 4 到第 n 的运动员，只能获得他们的名次编号（即，名次第 x 的运动员获得编号 "x"）。
     * 使用长度为 n 的数组 answer 返回获奖，其中 answer[i] 是第 i 位运动员的获奖情况。
     */
    public static void main(String[] args) {
        int[] score = new int[]{5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(findRelativeRanks((score))));

        score = new int[]{10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeRanks((score))));
    }

    public static String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        for (int i=0; i<score.length; i++) {
            int idx = score.length;
            for (int j=0; j<score.length; j++) {
                if (score[i] > score[j]) {
                    idx--;
                }
            }
            switch (idx){
                case 1 :
                    result[i] = "Gold Medal";
                    break;
                case 2 :
                    result[i] = "Silver Medal";
                    break;
                case 3 :
                    result[i] = "Bronze Medal";
                    break;
                default:
                    result[i] = String.valueOf(idx);
            }
        }
        return result;
    }
}
