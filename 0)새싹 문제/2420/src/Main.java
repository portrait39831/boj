import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt(); //n과 m 자체는 20억까지니까 int로 받아도 됨
        long m = sc.nextInt();

        long result;

        //20억 + 20억 = 40억이라서 int형을 벗어남. n-m이 오버플로우 나니까 n과 m이 long인 것이 편함
        if (n-m < 0) {
            result = -1 * (n-m);
        }
        else {
            result = n - m;
        }
        System.out.println(result);
    }
}
