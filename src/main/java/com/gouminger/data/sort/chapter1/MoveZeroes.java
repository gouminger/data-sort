package com.gouminger.data.sort.chapter1;

import java.util.Arrays;

//移动0
public class MoveZeroes {

    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
     */
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes1(int[] nums) {
        for (int i=0; i<nums.length-1; i++) {
            for (int j=0; j<nums.length-1-i; j++) {
                if (nums[j] == 0) {
                    int t = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = t;
                }
            }
        }
    }

    public static void moveZeroes2(int[] nums) {
        boolean swap = false;
        for (int i=0; i<nums.length-1; i++) {
            for (int j=0; j<nums.length-1-i; j++) {
                if (nums[j] == 0) {
                    int t = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = t;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public static void moveZeroes3(int[] nums) {
        boolean swap = true;
        int len = nums.length - 1;
        int lastIndex = 0;
        while (swap) {
            swap = false;
            for (int i=0; i<len; i++) {
                if (nums[i] == 0) {
                    nums[i] = nums[i] ^ nums[i+1];
                    nums[i+1] = nums[i] ^ nums[i+1];
                    nums[i] = nums[i] ^ nums[i+1];

                    swap = true;
                    lastIndex = i;
                }
            }
            len = lastIndex;
        }
    }

    public static void moveZeroes(int[] nums) {
        int idx = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx++] = nums[i];
            }
        }
        while (idx < nums.length) {
            nums[idx++] = 0;
        }
    }
}
