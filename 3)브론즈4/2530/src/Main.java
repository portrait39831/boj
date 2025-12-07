import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = sc.nextInt();

        for (int i = 0; i < d; i++) {
            c = c + 1;
            if (c == 60) {
                c = 0;
                b = b + 1;
                if (b == 60) {
                    b = 0;
                    a = a + 1;
                    if (a == 24) {
                        a = 0;
                    }
                }
            }
        }

        System.out.printf("%d %d %d", a, b, c);

    }
}
