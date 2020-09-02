package com.stucture;

import java.util.Scanner;

/**
 * @author Sun Mingshan
 * @Description TODO
 * @date 2020/9/1 20:10
 */
public class dfs {
    static boolean[] booleans = new boolean[10];
    static int bound;
    static int[] nums = new int[10];
    static void dfsVoid(int u) {
        if (u==bound){
            for (int i = 0; i<bound;i++){
                System.out.print(nums[i]+" ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= bound; i++) {
            if (!booleans[i]){
                nums[u] = i;
                booleans[i] = true;
                dfsVoid(u+1);
                booleans[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bound = sc.nextInt();
        dfsVoid(0);
    }
}
