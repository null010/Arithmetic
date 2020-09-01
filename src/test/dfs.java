package test;

import java.util.Scanner;

public class dfs {
    static int bound;
    static boolean[] booleans = new boolean[10];
    static int[] nums = new int[10];
    static void dfsAllSort(int u){
        /*层数是否触底（树结构）*/
        if (bound == u){
            for (int i = 0;i < bound;i++){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        /*赋值*/
        for (int i = 1;i <= bound;i++){
            if (!booleans[i]){
                nums[u] = i;
                booleans[i] = true;
                dfsAllSort(u+1);
                booleans[i] = false;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bound = sc.nextInt();
        dfsAllSort(0);
    }
}
