package Bronze5.BOJ15963;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //21억(int 범위) < 9,999,999,999 이므로  long 필요
        long n = sc.nextLong();
        long m = sc.nextLong();

        System.out.println(n == m
                ? 1
                : 0);
    }
}

