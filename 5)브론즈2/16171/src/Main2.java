import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] s = br.readLine().toCharArray();
        char[] t = br.readLine().toCharArray();

        int sIndex = 0;
        int tIndex = 0;
        int returnIndex = 0;


        while (tIndex != t.length && sIndex != s.length) {
            //숫자면 s 인덱스만 올리기
            if (s[sIndex] <= 57) {
                sIndex += 1;
            }

            else {
                //다음 첫 번째 글자가 될 가능성이 있는 글자의 인덱스 저장
                if (s[sIndex] == t[0] && tIndex != 0 && returnIndex == 0) {
                    returnIndex = sIndex;
                }

                //일치하면 둘 다 인덱스 올리기
                if (s[sIndex] == t[tIndex]) {
                    sIndex += 1;
                    tIndex += 1;
                }
                //불일치하면 s 인덱스 올리고 t는 초기화
                else {
                    tIndex = 0;

                    //저장되어있는 인덱스가 있으면 올린 인덱스 말고 저장된 인덱스로 이동
                    if (returnIndex != 0) {
                        sIndex = returnIndex;
                        returnIndex = 0;
                    }
                    else {
                        sIndex += 1;
                    }
                }
            }
        }

        bw.write(tIndex == t.length ? "1" : "0");
        bw.flush();
    }
}