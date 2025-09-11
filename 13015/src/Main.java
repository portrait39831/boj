import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n-1; i++) {
            bw.write(" ".repeat(i));

            if (i == 0) {
                bw.write("*".repeat(n));
            }
            else {
                bw.write("*");
                bw.write(" ".repeat(n-2));
                bw.write("*");
            }

            bw.write(" ".repeat(2*(n-1-i)-1));

            if (i == 0) {
                bw.write("*".repeat(n));
            }
            else {
                bw.write("*");
                bw.write(" ".repeat(n-2));
                bw.write("*");
            }
            bw.newLine();
        }

        bw.write(" ".repeat(n-1));
        bw.write("*");
        bw.write(" ".repeat(n-2));
        bw.write("*");
        bw.write(" ".repeat(n-2));
        bw.write("*");
        bw.newLine();

        for (int i = 0; i < n-1; i++) {
            bw.write(" ".repeat(n-2-i));

            if (i == n - 2) {
                bw.write("*".repeat(n));
            }
            else {
                bw.write("*");
                bw.write(" ".repeat(n-2));
                bw.write("*");

            }

            bw.write(" ".repeat(2 * i + 1));

            if (i == n - 2) {
                bw.write("*".repeat(n));
            }
            else {
                bw.write("*");
                bw.write(" ".repeat(n-2));
                bw.write("*");

            }
            bw.newLine();
        }
        bw.flush();
    }
}