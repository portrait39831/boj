import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a * b;

        for (int i = 0; i < 3; i++) {
            System.out.println(a * (b % 10));
            b = (b - (b % 10)) / 10;
        }

        System.out.println(result);
    }
}
