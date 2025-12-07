import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();

        int x = a * p;
        int y = p > c ? b + d * (p-c) : b; //넘은 리터(p - c) 당 추가 요금

        System.out.println(Math.min(x, y));


    }
}
