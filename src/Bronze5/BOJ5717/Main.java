package Bronze5.BOJ5717;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int m = sc.nextInt();
            int f = sc.nextInt();

            if (m + f == 0) {
                break;
            }
            else {
                System.out.println(m+f);
            }
        }
    }
}

