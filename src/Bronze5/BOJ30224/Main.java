package Bronze5.BOJ30224;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        String[] arr = n.split("");
        int i = Integer.parseInt(n);

        int result = 0;

        if (i % 7 == 0) {
            result += 1;
        }

        for (String s : arr) {
            if (s.equals("7")) {
                result += 2;
                break;
            }
        }

        System.out.println(result);
    }
}


