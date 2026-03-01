package Bronze5.BOJ33612;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int y = 2024;
        int m = 8;

        for (int i = 0; i < n - 1; i++) {
            m += 7;
            if (m > 12) {
                m -= 12;
                y += 1;
            }
        }

        System.out.println(y + " " + m);
    }
}

