import java.io.*;
import java.util.*;

public class Main4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");

        int min = Integer.parseInt(arr[0]);
        int max = min;

        for (int i = 1; i < n; i++) {
            int temp = Integer.parseInt(arr[i]);
            min = Math.min(min, temp);
            max = Math.max(max, temp);
        }

        bw.write(min + " " + max);
        bw.flush();
    }
}
