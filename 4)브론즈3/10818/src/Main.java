import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int temp = sc.nextInt();
        int max = temp;
        int min = temp;

        for (int i = 0; i < n - 1; i++) {
            temp = sc.nextInt();

            if (max < temp) {
                max = temp;
            }
            else if (min > temp) {
                min = temp;
            }
        }

        System.out.println(min + " " + max);
    }
}
