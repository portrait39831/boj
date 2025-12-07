import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        int k = Integer.parseInt(br.readLine());

        if (k == 1) {
            for(String s : arr) {
                bw.write(s);
                bw.newLine();
            }
        }
        else if (k == 2) {
            for(String s : arr) {
                for (int i = n; i > 0; i--) {
                    bw.write(s.toCharArray()[i - 1]);
                }
                bw.newLine();
            }
        }
        else {
            for (int i = arr.length; i > 0; i--) {
                bw.write(arr[i - 1]);
                bw.newLine();
            }
        }

        bw.flush();
    }
}
