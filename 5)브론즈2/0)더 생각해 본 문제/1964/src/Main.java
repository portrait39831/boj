import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long result;
        long n = sc.nextLong(); //이거 int하니까 오버플로우 남(n제곱 때문인듯)

        result = 5 + ((n - 1) * (3 * n + 8)) / 2;
        //수열의 합 공식을 구해서 계산함(등차도 등비도 아님 얘는)

        System.out.println(result % 45678);

    }
}
