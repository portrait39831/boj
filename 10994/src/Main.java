import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = 4 * n - 5;

        for (int i = 0; i < 2 * (n - 1); i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            for (int j = 0; j < r; j++) {
                if (i % 2 == 0) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            r -= 2;

            for (int j = i; j >= 0; j--) {
                if (j % 2 == 0) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//
        for (int i = 0; i < 4 * n - 3; i++) {
            if (i % 2 == 0) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
//
        r = 1;

        for (int i = 2 * (n - 1); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }//

            for (int j = 0; j < r; j++) {
                if (i % 2 == 0) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            r += 2;

            for (int j = i; j > 0; j--) {
                if (j % 2 == 0) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}