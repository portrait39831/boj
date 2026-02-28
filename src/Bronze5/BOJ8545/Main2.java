package Bronze5.BOJ8545;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.print(str.charAt(2-i));
        }
    }
}

