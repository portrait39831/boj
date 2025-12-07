import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[] arr = sc.nextLine().split("");

        int result = 0;

        for (int i = 0; i < n; i++) {
            result += Integer.parseInt(arr[i]);
        }

        System.out.println(result);
    }
}