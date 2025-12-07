import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

        for (int i = 2; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 2 * i - 3; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < 2 * n - 1 && n != 1; i++) {
            System.out.print("*");
        }
    }
}
