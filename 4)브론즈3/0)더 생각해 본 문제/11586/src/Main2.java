import java.io.*;

public class Main2 {
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
                bw.write(new StringBuilder(s).reverse().toString()); //null일 때 널포인터 예외 발생
                //String.valueOf(new StringBuilder(s).reverse()) /null일 때 그냥 문자열로 "null" 출력
                bw.newLine();
            }
        }
        else {
            for (int i = arr.length - 1; i >= 0; i--) {
                bw.write(arr[i]);
                bw.newLine();
            }
        }

        bw.flush();
    }
}
