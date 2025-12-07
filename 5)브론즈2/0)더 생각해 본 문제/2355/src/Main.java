import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int a = Math.min(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
        int b = Math.max(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));

        BigInteger m = new BigInteger(a + "");
        BigInteger n = new BigInteger(b + "");

        if (b <= 0) {
            bw.write((n.multiply(n.subtract(new BigInteger("1")))
                    .subtract(m.multiply(m.subtract(new BigInteger("1")))))
                    .divide(new BigInteger("2")).add(n) + "");
        }
        else if (a >= 0) {
            bw.write((n.multiply(n.add(new BigInteger("1")))
                    .subtract(m.multiply(m.add(new BigInteger("1")))))
                    .divide(new BigInteger("2")).add(m) + "");
        }
        else {
            bw.write((n.multiply(n.add(new BigInteger("1")))
                    .subtract(m.multiply(m.subtract(new BigInteger("1")))))
                    .divide(new BigInteger("2")) + "");
        }

        bw.flush();
    }
}
