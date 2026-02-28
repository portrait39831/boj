package Sprout.BOJ10871;

import java.util.*;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a;
        String result = "";

        int n = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 0; n > i; i++){
            a = sc.nextInt();

            if(a < x){
                result += a + " ";
            }
        }

        System.out.println(result);
    }
}
