import java.math.BigInteger;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger m = new BigInteger(sc.next());
        BigInteger n = new BigInteger(sc.next());

        System.out.println(m.divide(n)); //몫만 출력함
        System.out.println(m.mod(n)); //mod 연산은 0이 안 나옴(음수 범위에서 좀 다르더라)
    }
}
