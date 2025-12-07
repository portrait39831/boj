import java.io.*;
import java.util.*;

public class Main3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.parseInt(st.nextToken());
        int max = min;

        for (int i = 0; i < n - 1; i++) {
            int temp = Integer.parseInt(st.nextToken());
            min = Math.min(min, temp);
            max = Math.max(max, temp);
        }

        bw.write(min + " " + max);
        bw.flush();
    }
}
