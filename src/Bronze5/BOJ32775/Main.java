package Bronze5.BOJ32775;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int f = sc.nextInt();

        System.out.println(s > f
                ? "flight" //시간이 "적다면"(미만)
                : "high speed rail");
    }
}

