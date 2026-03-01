package Bronze5.BOJ27433;

import java.util.*;
import java.math.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        BigInteger result = new BigInteger("1");

        for (int i = n; i > 0; i--) {
            result = result.multiply(new BigInteger(n + ""));
            n -= 1;
        }

        System.out.println(result);
    }
}
