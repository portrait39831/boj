package Bronze5.BOJ30664;

import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger fourtytwo = new BigInteger("42");

        while (true) {
            BigInteger n = sc.nextBigInteger();

            if (String.valueOf(n).equals("0")) {
                break;
            }

            if (n.remainder(fourtytwo).equals(new BigInteger("0"))) {
                System.out.println("PREMIADO");
            }
            else {
                System.out.println("TENTE NOVAMENTE");
            }
        }
    }
}


