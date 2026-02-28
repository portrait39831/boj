package Sprout.BOJ2475;

import java.util.*;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int result = 0;
        String[] arr = sc.nextLine().split(" ");

        for(int i = 0; i < 5; i++){
            result = result + Integer.parseInt(arr[i]) * Integer.parseInt(arr[i]);
        }
        result = result % 10;

        System.out.print(result);

    }
}
