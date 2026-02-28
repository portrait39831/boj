package Bronze5.BOJ1271;

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger m = new BigInteger(sc.next());
        BigInteger n = new BigInteger(sc.next());

        System.out.println(m.divide(n)); //몫만 출력함
        System.out.println(m.mod(n));
    }
}

