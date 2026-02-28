package Bronze5.BOJ4101;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                break;
            }
            else {
                System.out.println(a > b
                        ? "Yes"
                        : "No");
            }
        }
    }
}

