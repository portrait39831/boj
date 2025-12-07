import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        char[] name;

        for (int i = 0; i < n; i++) {
            name = br.readLine().toCharArray();
            //toCharArray라는 메소드가 있구나

            bw.write("String #" + (i + 1) + "\n");
            for (char c : name) {
                bw.write(c == 90 ? 'A': (char)(c + 1));
            }
            bw.write("\n\n");
        }
        bw.flush();
    }
}
