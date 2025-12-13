import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split("");

        int n;
        int result = 0;
        for (String s : arr) {
            n = Integer.parseInt(s);
            result += n * n * n * n * n;
        }

        System.out.println(result);
    }
}
