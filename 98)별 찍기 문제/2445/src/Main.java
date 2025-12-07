import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i < n + 1; i++) {
            String line = "";
            for (int j = 0; j < i; j++) {
                line = line + "*";
            }
            for (int j = 2 * (n-i); j > 0; j--) {
                line = line + " ";
            }
            for (int j = 0; j < i; j++) {
                line = line + "*";
            }
            System.out.println(line);
        }

        for (int i = n-1; i > 0; i--) {
            String line = "";
            for (int j = i; j > 0; j--) {
                line = line + "*";
            }
            for (int j = 2 * n; j > 2 * i; j--) {
                line = line + " ";
            }
            for (int j = i; j > 0; j--) {
                line = line + "*";
            }
            System.out.println(line);
        }

    }
}
