package Bronze5.BOJ32314;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int w = sc.nextInt();
        int v = sc.nextInt();

        if (a <= w / v) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}

