package com.company;

import java.util.Scanner;

public class MergeSort {
    //借助中间数组
    static int[] tmp = new int[1000010];

    static void mergeSort(int[] q, int l, int r) {
        /*条件*/
        if (l >= r) return;

        int mid = (l+r)/2;
        /*递归*/
        mergeSort(q, l, mid);
        mergeSort(q, mid + 1, r);
        /*归并*/
        int i = l;
        int k = 0;
        int j = mid + 1;

        while (i <= mid && j <= r) {
            if (q[i] <= q[j]) tmp[k++] = q[i++];
            else tmp[k++] = q[j++];
        }
        while (i <= mid) {
            tmp[k++] = q[i++];
        }
        while (j <= r) {
            tmp[k++] = q[j++];
        }
        /*最终归并*/
        for (i = l ,j = 0; i <= r; i++,j++) {
            q[i] = tmp[j];
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*定义数组大小*/
        int listSize = sc.nextInt();
        sc.nextLine();
        /*获取输入值*/
        String[] strings = sc.nextLine().trim().split(" ");
        int[] q = new int[listSize];
        for (int i = 0; i < listSize; i++) {
            q[i] = Integer.parseInt(strings[i]);
        }
        // for (int j = 0; j < listSize; j++) {
        //     System.out.print(q[j]+" ");
        // }
        mergeSort(q, 0, listSize - 1);
        /*打印结果*/
        // System.out.println();
        for (int j = 0; j < listSize; j++) {
            System.out.print(q[j]+" ");
        }

    }
}
