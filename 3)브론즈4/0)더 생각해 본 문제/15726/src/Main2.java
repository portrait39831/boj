import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        int result;

        if (a * b / c > a / b * c) {
            result = (int)(a * b / c);
        }
        else {
            result = (int)(a / b * c);
        }

        System.out.printf("%d",result);
    }
}
