package Sprout.BOJ2739;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= 9; i++){
            System.out.printf("%d * %d = %d\n",n ,i , n*i);
            //printf는 줄바꿈이 되지 않으므로 반드시 \n 붙이자
        }

    }
}
