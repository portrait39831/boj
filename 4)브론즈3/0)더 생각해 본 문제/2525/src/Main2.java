import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();

        System.out.printf("%d %d", (a + c / 60 + (b + c % 60) / 60) % 24, (b + c % 60) % 60);
        //(기존 시간 + 입력한 시간 + 기존 분과 입력한 분의 합이 60분을 넘는지) % 24 시, 기존 분 + 입력한 분 % 60 분
    }
}
