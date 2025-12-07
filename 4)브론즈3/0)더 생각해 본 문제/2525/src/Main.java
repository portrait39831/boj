import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        b += sc.nextInt(); //분을 왕창 더해서 시간으로 환산하기

        System.out.printf("%d %d", (a + b / 60) % 24, b % 60);

    }
}
