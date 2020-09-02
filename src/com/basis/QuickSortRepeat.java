package com.basis;

import java.util.Scanner;

/**
 * @author Sun Mingshan
 * @Description TODO
 * @date 2020/8/23 0:14
 */
public class QuickSortRepeat {
    static void QuickSort(int[] nums,int l,int r){
        /*判断*/
        if(l>=r){
            return;
        }
        /*构造指针和比较值*/
        int i = l-1;
        int j = r+1;
        int x = nums[l];
        /*移动指针并判断*/
        while (i<j){
            do{ i++;}while(nums[i]<x);
            do{ j--;}while(nums[j]>x);
            if (i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        /*左右区域递归*/
        QuickSort(nums,l,j);
        QuickSort(nums,j+1,r);
    }

    public static void main(String[] args) {
        /*外界输入*/
        Scanner sc = new Scanner(System.in);
        int ListSize = sc.nextInt();
        int[] nums = new int[ListSize];
        String[] strs = sc.next().trim().split(",");
        for (int i=0;i<ListSize;i++){
            nums[i] = Integer.parseInt(strs[i]);
        }
        /*调用方法*/
        QuickSort(nums,0,nums.length-1);
        /*查询*/
        for (int i:nums) {
            System.out.print(i+",");
        }
    }
}
