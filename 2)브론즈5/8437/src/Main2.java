import java.util.*;
import java.math.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger total = sc.nextBigInteger();
        BigInteger gap = sc.nextBigInteger();

        BigInteger g1 = total.subtract(gap).divide(new BigInteger("2"));
        BigInteger g2 = g1.add(gap);
        System.out.println(g2);
        System.out.println(g1);
    }
}
