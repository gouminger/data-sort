package com.gouminger.data.sort.chapter3;

import java.util.Arrays;

//数组的相对排序
public class RelativeSortArray {

    /**
     * 给你两个数组，arr1 和arr2，arr2中的元素各不相同，arr2 中的每个元素都出现在arr1中。
     * 对 arr1中的元素进行排序，使 arr1 中项的相对顺序和arr2中的相对顺序相同。
     * 未在arr2中出现过的元素需要按照升序放在arr1的末尾。
     */
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = new int[]{2, 1, 4, 3, 9, 6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));

        arr1 = new int[]{28,6,22,8,44,17};
        arr2 = new int[]{22,28,8,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] counting = new int[1001];
        for (int num : arr1) {
            counting[num]++;
        }
        int cnt = 0, t;
        int[] counts = new int[1001];
        for (int num : arr2) {
            counts[num] = cnt;
            cnt += counting[num];
            counting[num] = 0;
        }
        for (int i=0; i<counting.length; i++) {
            if (counting[i] > 0) {
                counts[i] = cnt;
                cnt += counting[i];
            }
        }
        int[] result = new int[arr1.length];
        for (int num : arr1) {
            result[counts[num]] = num;
            counts[num]++;
        }
        return result;
    }

}
