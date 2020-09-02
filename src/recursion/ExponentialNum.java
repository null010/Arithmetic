package recursion;

import java.util.Scanner;

public class ExponentialNum {
    static int bound;
    static boolean[] booleans = new boolean[20];
    static void dfs(int u){
        if (u > bound){
            for (int i = 1 ;i <= bound ;i++) {
                if (booleans[i]){
                    System.out.print(i);
                }
            }
            System.out.println();
            return;
        }

        booleans[u] = false;
        dfs(u+1);

        booleans[u] = true;
        dfs(u+1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bound = scanner.nextInt();
        dfs(1);
    }
}
