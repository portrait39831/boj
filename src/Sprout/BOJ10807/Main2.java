package Sprout.BOJ10807;

import java.util.*;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Integer> num = new ArrayList<Integer>();
        int result = 0;

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            num.add(a);
        }
        int v = sc.nextInt();

        for(int i = 0; i < n; i++){
            if (v == num.get(i)){
                result = result + 1;
            }
        }

        System.out.println(result);
    }
}
