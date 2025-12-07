import java.io.*;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                bw.write(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();

    }
}
