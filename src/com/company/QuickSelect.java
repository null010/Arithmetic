package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Sun Mingshan
 * @Description TODO
 * @date 2020/8/24 19:32
 */
public class QuickSelect {

    static int QuickSelect(int[] q, int l, int r, int k) {
        /*判定*/
        if (l == r) {
            return q[l];
        }
        /*构造*/
        int i = l - 1;
        int j = r + 1;
        int x = q[l];
        /*筛选*/
        while (i < j) {
            do i++; while (q[i] < x);
            do j--; while (q[j] > x);
            if (i < j) {
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }
        int leftArea = j - l + 1;
        if (k <= leftArea) {
            return QuickSelect(q, l, j, k);
        }
        return QuickSelect(q, j + 1, r, k-leftArea);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int listSize = sc.nextInt();
        int[] ints = new int[listSize];

        int k = sc.nextInt();
        sc.nextLine();
        String[] strings = sc.nextLine().split(" ");
        for (int i = 0; i < strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        // System.out.println("k:"+k+"listSize:"+listSize);
        // for (int n:ints) {
        //     System.out.println(n);
        // }

        System.out.println(QuickSelect(ints, 0, ints.length - 1, k));
    }

}
