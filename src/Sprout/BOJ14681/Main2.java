package Sprout.BOJ14681;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x*y < 0
                ? x < 0 ? 2 : 4
                : x > 0 ? 1 : 3
        );
    }
}

