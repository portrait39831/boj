package Bronze5.BOJ25372;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String password = sc.next();

            if (password.length() >= 6 && password.length() <= 9) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}

