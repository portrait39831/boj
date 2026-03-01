package Bronze5.BOJ34454;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();
        int p = sc.nextInt();

        if (n <= c * p) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
