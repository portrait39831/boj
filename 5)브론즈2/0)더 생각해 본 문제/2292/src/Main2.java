import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        int result = (int)Math.ceil((3 + Math.sqrt(12 * n - 3)) / 6);
        //12 * n이 오버플로우를 유발할 수 있음

        System.out.println(result);
    }
}
