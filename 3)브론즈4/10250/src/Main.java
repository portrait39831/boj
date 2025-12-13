import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int row;
            int col;
            if (n % h == 0) {
                row = h;
            }
            else {
                row = n % h;
            }

            col = (n-1) / h + 1;
            if (col < 10) {
                System.out.println(row + "0" + col);
            }
            else {
                System.out.println(row + "" + col);
            }
        }
    }
}
