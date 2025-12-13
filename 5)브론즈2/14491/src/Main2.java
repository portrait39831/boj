import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();

        int digit = 1;

        while (t > 0) {
            sb.append(t % (digit * 9) / digit);
            t -= t % (digit * 9);

            digit *= 9;
        }

        System.out.println(sb.reverse());


    }
}
