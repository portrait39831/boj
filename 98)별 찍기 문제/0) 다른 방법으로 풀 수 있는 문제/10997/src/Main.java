import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            bw.write("*");
        }
        else {
            for (int i = 0; i < 2 * n - 1; i++) {
                if (i % 2 == 0) {
                    bw.write("*");
                    bw.write(" *".repeat(i / 2));

                    if (i == 0) {
                        bw.write("*".repeat(4 * n - 5));
                    }
                    else {
                        bw.write("*".repeat(4 * (n - i/2) - 3));
                    }
                    if (i > 2) {
                        bw.write("* ".repeat((i - 2) / 2 ));
                    }
                    bw.write("*");
                    bw.newLine();
                }
                else {
                    bw.write("*");
                    bw.write(" *".repeat(i / 2));
                    if (i != 1) {
                        bw.write(" ".repeat(4 * (n - i/2) - 3));
                    }
                    if (i > 3) {
                        bw.write("* ".repeat((i-2)/2));
                    }
                    if (i > 1) {
                        bw.write("*");
                    }
                    bw.newLine();
                }
            }
            for (int i = 0; i < 2; i++) {
                bw.write("* ".repeat(2*(n-1)));
                bw.write("*");
                bw.newLine();
            }
            for (int i = 0; i < 2 * (n - 1); i++) {
                if (i % 2 == 0) {
                    bw.write("* ".repeat(n - 1 - i/2));
                    bw.write(" ".repeat(4 * (i / 2) + 1));
                    bw.write(" *".repeat(n - 1 - i/2));
                }
                else {
                    bw.write("* ".repeat(n - 2 - i/2));
                    bw.write("*".repeat(4 * (i / 2) + 5));
                    bw.write(" *".repeat(n - 2 - i/2));
                }
                bw.newLine();
            }
        }
        bw.flush();
    }
}