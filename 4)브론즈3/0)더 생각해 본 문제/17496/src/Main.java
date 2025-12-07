import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int c = sc.nextInt();
        int p = sc.nextInt();

        System.out.println(((n - 1) / t * c * p));
        //첫 날만 없으면 1234 1234 1234 되니까 총 기간에서 첫 날만 빼면 되는구나
    }
}

/*

무지성으로 (n / t)하면 안되는 이유 :
자라는 데 걸리는 시간이 4일이고 최종 시간이 8일이라고 치면 (n / t)는 2지만

0 1 2 3 4
        0 1 2 3 4(<< 9일이라 수확 못 함) 이라서 결과는 1이어야 함

*/