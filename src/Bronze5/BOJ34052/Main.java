package Bronze5.BOJ34052;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t14 = 0;

        for (int i = 0; i < 4; i++) {
            t14 += sc.nextInt();
        }

        System.out.println(t14 <= 1500
                ? "Yes"
                : "No");
    }
}

