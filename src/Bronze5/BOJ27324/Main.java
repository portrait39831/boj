package Bronze5.BOJ27324;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(n % 11 == 0 ? 1 : 0);
    }
}

