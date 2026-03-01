package Bronze5.BOJ29163;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int odd = 0;
        int even = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if (a % 2 == 0) {
                even += 1;
            }
            else {
                odd += 1;
            }
        }

        if (even > odd) {
            System.out.println("Happy");
        }
        else {
            System.out.println("Sad");
        }
    }
}

