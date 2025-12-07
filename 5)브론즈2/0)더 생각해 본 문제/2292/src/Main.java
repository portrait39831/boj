import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int n = sc.nextInt();

        while(true) {
            if (3 * i * i - 3 * i + 1 >= n) break;
            i += 1;
        }

        System.out.println(i);
    }
}
