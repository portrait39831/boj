package Bronze5.BOJ26209;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result = "S";

        for (int i = 0; i < 8; i++) {
            int bit = sc.nextInt();

            if (bit == 9) {
                result = "F";
            }
        }
        System.out.println(result);
    }
}

