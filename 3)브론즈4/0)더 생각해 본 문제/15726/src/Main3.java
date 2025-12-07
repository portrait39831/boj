import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result;

        if (a * (double)b / c > a / (double)b * c) {
            result = (int)(a * (double)b / c);
        }
        else {
            result = (int)(a / (double)b * c);
        }

        System.out.printf("%d",result);
    }
}
