package Sprout.BOJ11382;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        //int는 2^31 - 1까지의 수만 담을 수 있으며 10^12를 넣으면 InputMismatch 런타임 에러가 발생함!!

        System.out.println(a+b+c);

    }
}
