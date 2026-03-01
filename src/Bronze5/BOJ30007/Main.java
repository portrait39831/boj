package Bronze5.BOJ30007;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] w = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();

            w[i] = a * (x-1) + b;
        }

        for (int water : w) {
            System.out.println(water);
        }
    }
}

