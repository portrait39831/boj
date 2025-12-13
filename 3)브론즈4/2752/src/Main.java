import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        int c = sc.nextInt();

        if (b > c) {
            b = b + c;
            c = b - c;
            b = b - c;
        }
        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        System.out.printf("%d %d %d", a, b, c);

    }
}
