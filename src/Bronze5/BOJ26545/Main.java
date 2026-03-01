package Bronze5.BOJ26545;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            result += num;
        }

        System.out.println(result);
    }
}

