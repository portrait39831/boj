package Sprout.BOJ15964;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();

        System.out.printf("%d",(a+b)*(a-b));
    }
}
