package Bronze5.BOJ11021;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 1; i <= t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.printf("Case #%d: %d\n", i, a+b);
        }
    }
}
