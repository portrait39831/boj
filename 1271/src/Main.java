import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger m = new BigInteger(sc.next());
        BigInteger n = new BigInteger(sc.next());

        System.out.println(m.divide(n));
        System.out.println(m.remainder(n));
    }
}