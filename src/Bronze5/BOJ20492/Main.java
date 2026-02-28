package Bronze5.BOJ20492;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(n / 100 * 78);
        System.out.println(n / 1000 * 956);
    }
}

