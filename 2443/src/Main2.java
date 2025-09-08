import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            bw.write(" ".repeat(i));
            bw.write("*".repeat(2 * (n - i) - 1));
            bw.newLine();
        }
        bw.flush();
    }
}
