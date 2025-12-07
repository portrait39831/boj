import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int p = sc.nextInt();

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            arr[i] -= l * p;
        }

        System.out.printf("%d %d %d %d %d", arr[0], arr[1], arr[2], arr[3], arr[4]);
    }
}
