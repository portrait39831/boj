import java.io.*;
import java.math.*;

public class Main2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        long m = Math.max(Long.parseLong(arr[0]), Long.parseLong(arr[1]));
        long n = Math.min(Long.parseLong(arr[0]), Long.parseLong(arr[1]));

        long result;

        result = (m + n) * (m - n + 1) / 2;

        //답을 계속 틀렸던 이유는 오버플로우 때문이 아니라 그냥 식이 틀려서임
        //m, n이 뭐던 간에 해당 식으로 합을 계산할 수 있음

        //long 최대 = 2^63 - 1, int 최대 = 2^31 -1
        //그러니까 2 ^ 31과 2^31 + 1의 곱을 long이 커버할 수 있음

        bw.write(result + "");
        bw.flush();
    }
}
