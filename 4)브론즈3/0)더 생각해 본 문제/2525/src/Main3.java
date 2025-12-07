import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();

        while (c != 0) {
            b += 1;

            if (b == 60) {
                b = 0;
                a += 1;
            }

            if (a == 24) {
                a = 0;
            }

            c -= 1;
        }

        System.out.print(a + " " + b);
    }
}
