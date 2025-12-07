import java.io.*;

public class Main3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            bw.write(" ".repeat(n-i-1));
            bw.write("*".repeat(2 * i + 1));
            bw.newLine();
        }
        for (int i = 0; i < n - 1; i++) {
            bw.write(" ".repeat(i + 1));
            bw.write("*".repeat(2 * (n-i) - 3));
            bw.newLine();
        }
        bw.flush();
    }
}
