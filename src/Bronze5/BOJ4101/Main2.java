package Bronze5.BOJ4101;

import java.math.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a + b != 0){
            if (a > b){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }

            a = sc.nextInt();
            b = sc.nextInt();
        }
    }
}
