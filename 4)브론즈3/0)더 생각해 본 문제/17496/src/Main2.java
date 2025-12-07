import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int c = sc.nextInt();
        int p = sc.nextInt();

        System.out.println(n % t == 0
                ? ((n / t) - 1) * c * p
                : (n / t) * c * p);
        // n / t번 수확하기 위해서 최소 (n / t) + 1일 걸리니까 n / t일이면 (n / t) - 1번 수확한거임
        // 처음엔 이렇게 생각했는데 어쩐지 뭔가 어렵더라...
    }
}
