import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m - 45 < 0) {
            if (h - 1 < 0) {
                h = 23;
            }
            else {
                h -= 1;
            }
            m += 15;
        }
        else {
            m -= 45;
        }

        System.out.println(h + " " + m);
    }
}
