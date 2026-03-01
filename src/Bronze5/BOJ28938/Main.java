package Bronze5.BOJ28938;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 0;

        for (int i = 0; i < n; i++) {
            result += sc.nextInt();
        }

        if (result > 0) {
            System.out.println("Right");
        }
        else if (result < 0) {
            System.out.println("Left");
        }
        else {
            System.out.println("Stay");
        }
    }
}

