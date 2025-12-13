import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        int insert;
        int temp;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            insert = i;
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] > arr[insert]) {
                    temp = arr[insert];
                    arr[insert] = arr[j];
                    arr[j] = temp;

                    insert -= 1;
                }
                else {
                    break;
                }
            }
        }
        for(int num : arr) {
            bw.write(num + "");
            bw.newLine();
        }

        bw.flush();
    }
}
