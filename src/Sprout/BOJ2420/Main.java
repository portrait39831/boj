package Sprout.BOJ2420;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long m = sc.nextInt();

        long result;
        if (n-m < 0) {
            result = -1 * (n-m);
        }
        else {
            result = n - m;
        }
        System.out.println(result);
    }
}

