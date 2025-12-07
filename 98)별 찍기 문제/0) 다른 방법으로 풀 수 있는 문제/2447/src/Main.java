import java.util.*;
import java.io.*;

class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(arr,"*");
            if (i % 3 == 1) {
                for (int j = 0; j < n; j++) {
                    if (j % 3 == 1) {
                        arr[j] = " ";
                    }
                }
            }
            if (i % 9 > 2 && i % 9 < 6) {
                for (int j = 0; j < n; j++) {
                    if (j % 9 > 2 && j % 9 < 6) {
                        arr[j] = " ";
                    }
                }
            }
            if (i % 27 > 8 && i % 27 < 18) {
                for (int j = 0; j < n; j++) {
                    if (j % 27 > 8 && j % 27 < 18) {
                        arr[j] = " ";
                    }
                }
            }
            if (i % 81 > 26 && i % 81 < 54) {
                for (int j = 0; j < n; j++) {
                    if (j % 81 > 26 && j % 81 < 54) {
                        arr[j] = " ";
                    }
                }
            }
            if (i % 243 > 80 && i % 243 < 162) {
                for (int j = 0; j < n; j++) {
                    if (j % 243 > 80 && j % 243 < 162) {
                        arr[j] = " ";
                    }
                }
            }
            if (i % 729 > 242 && i % 729 < 486) {
                for (int j = 0; j < n; j++) {
                    if (j % 729 > 242 && j % 729 < 486) {
                        arr[j] = " ";
                    }
                }
            }
            if (i % 2187 > 728 && i % 2187 < 1458) {
                for (int j = 0; j < n; j++) {
                    if (j % 2187 > 728 && j % 2187 < 1458) {
                        arr[j] = " ";
                    }
                }
            }

            for (int j = 0; j < n; j++) {
                bw.write(arr[j]);
            }
            bw.newLine();
        }
        bw.flush();
    }
}