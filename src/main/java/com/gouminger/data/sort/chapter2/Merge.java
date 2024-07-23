package com.gouminger.data.sort.chapter2;

import java.util.Arrays;

//面试题 10.01. 合并排序的数组
public class Merge {

    /**
     * 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
     * 初始化A 和 B 的元素数量分别为m 和 n。
     */
    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 0, 0, 0, 0};
        int[] B = new int[]{2, 5, 6, 9};
        int m = 3, n = 4;
        merge(A, m, B, n);
        System.out.println(Arrays.toString(A));

        int[] nums = new int[]{3, 6, 5, 11, 7, 2, 8, 0, 1, 28, 14};
        mergeSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void merge(int[] A, int m, int[] B, int n) {
        for (int i=m-1; i>=0; i--) {
            A[i+n] = A[i];
        }
        int idx1 = n, idx2 = 0;
        while (idx1<m+n && idx2<n) {
            if (A[idx1] < B[idx2]) {
                A[idx1+idx2-n] = A[idx1++];
            } else {
                A[idx1+idx2-n] = B[idx2++];
            }
        }
        while (idx1<m+n) {
            A[idx1+idx2-n] = A[idx1++];
        }
        while (idx2<n) {
            A[idx1+idx2-n] = B[idx2++];
        }
    }

    public static void mergeSort (int[] nums, int start, int end) {
        if (start == end) {
            return;
        }
        mergeSort(nums, start, (start+end)/2);
        mergeSort(nums, (start+end)/2+1, end);

        int[] arr = new int[end-start+1];
        int leftStart = start, leftEnd = (start+end)/2, rightStart = leftEnd+1, rightEnd = end, idx = 0;
        while (leftStart<=leftEnd && rightStart<=rightEnd) {
            if (nums[leftStart] > nums[rightStart]) {
                arr[idx++] = nums[rightStart++];
            } else {
                arr[idx++] = nums[leftStart++];
            }
        }
        while (leftStart<=leftEnd) {
            arr[idx++] = nums[leftStart++];
        }
        while (rightStart<=rightEnd) {
            arr[idx++] = nums[rightStart++];
        }
        idx = 0;
        while (start <= end){
            nums[start++] = arr[idx++];
        }
    }
}
