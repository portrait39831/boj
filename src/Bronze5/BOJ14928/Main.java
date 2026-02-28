package Bronze5.BOJ14928;

import java.io.*;

/*
TODO : BigInteger + 빠른 입출력 써도 시간초과 뜸, 나머지(10430번) 문제 참고. 브5 중 제일 어려운 문제 같음
TODO : 나머지 정리 응용 문제. 앞으로 수학 같으면 노트에 적으면서 풀자!!
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] n = br.readLine().split("");

        int result = 0;

        for (int i = 0; i < n.length; i++) {
            result = (result * 10 + Integer.parseInt(n[i])) % 20000303;
        }
        //result가 int형이라서 아스키코드로 읽어버림, String으로 캐스팅 필수
        bw.write(result + "");
        bw.flush();
    }
}

