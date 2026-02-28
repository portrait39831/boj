package Sprout.BOJ2475;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            n = n * n;
            result += n;
        }

        result = result % 10;
        System.out.println(result);


    }
}

