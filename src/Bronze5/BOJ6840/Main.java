package Bronze5.BOJ6840;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();

        int largest = Math.max(b1, Math.max(b2,b3));

        if (largest == b1) {
            System.out.println(Math.max(b2,b3));
        }
        else if (largest == b2) {
            System.out.println(Math.max(b1,b3));
        }
        else {
            System.out.println(Math.max(b1,b2));
        }
    }
}

