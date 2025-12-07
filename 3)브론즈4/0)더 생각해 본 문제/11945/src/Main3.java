import java.io.*;

public class Main3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        if (n != 0 && m != 0) {
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();

                String line = br.readLine();
                sb.append(line).reverse();
                //StringBuilder와 Collections는 .reverse()라는 개사기 메소드 보유함
                bw.write(sb + "\n");
            }
            bw.flush();
        }
    }
}