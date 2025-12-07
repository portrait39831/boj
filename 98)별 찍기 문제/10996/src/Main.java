import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    }
                    else {
                        if (j != n - 1) {
                            System.out.print(" ");
                        }
                    }
                }
            }
            else {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 0) {
                        if (j != n - 1) {
                            System.out.print(" ");
                        }
                    }
                    else {
                        System.out.print("*");
                    }
                }
            }

            System.out.println();
        }
    }
}
