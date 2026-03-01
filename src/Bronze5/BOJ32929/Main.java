package Bronze5.BOJ32929;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x % 3 == 1) {
            System.out.println("U");
        }
        else if (x % 3 == 2) {
            System.out.println("O");
        }
        else {
            System.out.println("S");
        }
    }
}

