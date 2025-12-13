import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        // (n-1) + n(m - 1) == n*m - 1
        System.out.println(m * n - 1);

    }
}
