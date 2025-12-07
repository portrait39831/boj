import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();

        int result = p;

        if (n >= 5) {
            result = Math.max(result - 500, 0);
        }
        if (n >= 10) {
            result = Math.min(result, p * 9/10);
        }
        if (n >= 15) {
            result = Math.min(result, Math.max(p-2000,0));
        }
        if (n >= 20) {
            result = Math.min(result, p * 3/4);
        }

        System.out.println(result);

    }
}
