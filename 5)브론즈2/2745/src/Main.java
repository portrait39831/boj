import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] n = sc.next().toCharArray();
        int b = sc.nextInt();

        int digit = 1;
        int result = 0;

        for (int i = n.length - 1; i >= 0; i--) {
            if (n[i] >= 65) {
                result += (n[i] - 55) * digit;
            }
            else {
                result += (n[i] - 48) * digit;
            }
            digit *= b;
        }
        System.out.println(result);
    }
}
