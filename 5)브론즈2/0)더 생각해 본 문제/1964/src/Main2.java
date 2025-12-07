import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 5;
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            result += ((i + 1) * 3 + 1) % 45678;
            result %= 45678;
        }

        System.out.println(result);

    }
}
