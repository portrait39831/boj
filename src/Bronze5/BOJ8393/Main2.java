package Bronze5.BOJ8393;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        while (n > 0) {
            result += n;
            n -= 1;
        }
        System.out.println(result);
    }
}
