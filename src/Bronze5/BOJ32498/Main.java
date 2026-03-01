package Bronze5.BOJ32498;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int odd = 0;

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();

            if (d % 2 == 1) {
                odd += 1;
            }
        }

        System.out.println(odd);
    }
}

