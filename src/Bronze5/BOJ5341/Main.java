package Bronze5.BOJ5341;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) { break; }

            int result = 0;

            for (int i = 1; i < n+1; i++) {
                result += i;
            }
            System.out.println(result);

        }
    }
}

