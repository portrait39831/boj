import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] result = new int[n];
        int temp = 0;

        for (int i = 0; i < n; i++) {
            result[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (result[j] > result[i]) {
                    temp = result[j];
                    result[j] = result[i];
                    result[i] = temp;
                }
            }
        }

        for (int num : result) {
            bw.write(num + "\n");
        }
        bw.flush();
    }
}
