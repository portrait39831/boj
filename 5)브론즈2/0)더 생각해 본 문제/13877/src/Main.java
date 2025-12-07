import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] testCase;
        int digit;
        int result;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            testCase = br.readLine().split(" ");
            char[] s = testCase[1].toCharArray();

            bw.write(testCase[0] + " ");

            digit = 1;
            result = 0;

            for (int j = s.length - 1; j >= 0; j--) {

                //8진수에는 첫 번째 자리 뿐만이 아니라 아예 8이나 9가 못 들어감..
                //8이 들어가면 자릿수가 바뀌는데 어떻게 가능하겠음

                if (s[j] == '8' || s[j] == '9') {
                    result = 0;
                    break;
                }
                result += Integer.parseInt(s[j] + "") * digit;
                digit *= 8;
            }
            bw.write(result + " ");

            bw.write(Integer.parseInt(testCase[1]) + " ");

            digit = 1;
            result = 0;

            for (int j = s.length - 1; j >= 0; j--) {
                result += Integer.parseInt(s[j] + "") * digit;
                digit *= 16;
            }

            bw.write(result + "\n");
            bw.flush();
        }
    }

    //최대 범위가 2의 4 * 7승 + ... 정도라서 2의 31승 - 1(int 범위)를 넘지 못 함

}