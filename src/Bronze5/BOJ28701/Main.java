package Bronze5.BOJ28701;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            result += i+1;
        }
        System.out.println(result);
        System.out.println(result * result);

        int result2 = 0;
        for (int i = 0; i < n; i++) {
            result2 += (i+1)*(i+1)*(i+1);
        }
        System.out.println(result2);
    }
}

