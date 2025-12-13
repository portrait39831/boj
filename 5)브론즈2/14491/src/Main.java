import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();

        // 100 = 1 * 9^2 + 2 * 9^1 + 1 * 9^0
        // (100 % 9) / 9^0한 다음에 (99 % 81) / 9^1이 (99 / 9) % (81 / 9)하고 같음 그래서 나눠도 됨
        //그리고 정수는 나머지 자동으로 없애주니까 100 / 9해도 되는거임

        while (true) {
            sb.append(t % 9);
            t /= 9;

            if (t == 0) {
                break;
            }
        }

        System.out.println(sb.reverse());


    }
}
