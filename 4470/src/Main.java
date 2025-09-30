import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        for (int i = 1; i < n+1; i++) {
            System.out.printf("%d. %s\n", i, arr[i-1]);
        }
    }
}
