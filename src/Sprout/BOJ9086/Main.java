package Sprout.BOJ9086;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            String[] str = sc.nextLine().split("");
            System.out.printf("%s%s\n",str[0],str[str.length - 1]);
        }
    }
}

