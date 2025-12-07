import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        String[] arr = new String[2];
        for (int i = 0; i < t; i++) {
            arr = br.readLine().split(" ");

            bw.write(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + "\n");
        }
        bw.flush();


    }
}
