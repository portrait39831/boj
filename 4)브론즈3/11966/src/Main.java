import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(recursion(n));
    }

    public static int recursion(int n) {
        if (n == 1) {
            return 1;
        }

        if (n % 2 == 0) {
            return recursion(n/2);
        }
        else {
            return 0;
        }
    }
}
