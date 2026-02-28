package Sprout.BOJ10952;

import java.util.*;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while(a+b != 0){
            System.out.println(a+b);

            a = sc.nextInt();
            b = sc.nextInt();
        }
    }
}
