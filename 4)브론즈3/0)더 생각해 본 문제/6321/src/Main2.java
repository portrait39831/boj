import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String name = br.readLine();

            bw.write("String #" + (i + 1) + "\n");

            for (int j = 0; j < name.length(); j++) {
                bw.write(name.charAt(j) == 90 ? 'A' : (char)(name.charAt(j) + 1));
            }
            bw.write("\n\n");
        }

        bw.flush();
    }
}
