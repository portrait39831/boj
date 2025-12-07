import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] sieve = new boolean[10000];

        sieve[0] = true;
        for (int i = 1; i < 10000; i++) {
            if (!sieve[i]) {

                //(i+1) 곱하기 2부터 쭉쭉 가서 10000 갈 때까지 전부 지움
                for (int j = 2; j <= 10000 / (i + 1); j++) {
                    sieve[j * (i + 1) - 1] = true;
                }
            }
        }

        int m = sc.nextInt();
        int n = sc.nextInt();

        int min = -1;
        int sum = 0;

        for (int i = m; i <= n; i++) {
            if (!sieve[i - 1]) {
                if (min == -1) {
                    min = i;
                }
                sum += i;
            }
        }

        if (min != -1) {
            System.out.println(sum);
        }
        System.out.println(min);

    }
}
