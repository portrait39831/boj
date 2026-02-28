package Bronze5.BOJ8545;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String str = sc.nextLine();

        for (int i = 0; i < 3; i++) {
            sb.append(str.charAt(2-i));
        }

        System.out.println(sb);
    }
}


