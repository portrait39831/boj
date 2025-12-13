import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        while(true) {
            int c = System.in.read();

            if (c >= 65) {
                sb.append((char)c);
            }

            else if (c == 10){
                break;
            }
        }


        String t = br.readLine();


        if (String.valueOf(sb).contains(t)) {
            bw.write("1");
        }
        else {
            bw.write("0");
        }

        bw.flush();
    }
}