import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        System.out.println(a.add(b));
    }
}

//14928번 큰 수 (BIG) 문제는 10^1000000 범위이고 이 문제는 -10^10000 ~ 10^10000 범위임. 차원이 다름..
