package Sprout.BOJ2744;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            //대문자가 65부터 90까지
            if (65 <= c && c <= 90) {
                c += 32;
            }
            //소문자가 97부터 122까지, 영어 대소문자로만 이루어져있다고 했으므로 그냥 else 썼음
            else {
                c -= 32;
            }

            bw.write(c);
        }
        bw.flush();
    }
}

