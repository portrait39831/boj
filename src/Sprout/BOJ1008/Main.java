package Sprout.BOJ1008;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a / b);

        //float는 너무 일찍 반올림해서 오차 범위를 벗어남
        // int형끼리 나누면 답이 int형이 나옴. /는 그냥 나누기, %는 나머지
    }
}