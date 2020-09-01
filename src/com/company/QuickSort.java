package com.company;
import java.util.List;
import java.util.Scanner;

public class QuickSort {
    static int ListSize;
    static int[] nums;
    static void QuickSort(int[] q,int l,int r) {
        if(l >= r) {
            return;
        }
        int i = l-1;
        int j = r+1;
        int medium = nums[l];
        while (i<j) {
            do {
                i++;
            } while (q[i]<medium);
            do {
                j--;
            } while (q[j]>medium);
            if (i < j) {
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }
        System.out.println("第一轮排序后");
        for (int z = 0;z < ListSize;z ++) {
            System.out.print(nums[z]);
        }
        //递归排序左边
        QuickSort(q, l, j);
        //递归排序右边
        QuickSort(q, j + 1, r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListSize = sc.nextInt();
        nums = new int[ListSize];
        String[] strs = sc.next().trim().split(",");
        for (int i = 0;i < ListSize;i ++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        for (int i = 0;i < ListSize;i ++) {
            System.out.println(nums[i]);
        }
        QuickSort(nums,0,ListSize-1);
        System.out.println("排序后");
        for (int i = 0;i < ListSize;i ++) {
            System.out.print(nums[i]);
        }
    }
}

