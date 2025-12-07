import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n != 0 && m != 0) {
            String[][] arr = new String[n][m];

            sc.nextLine(); //개행문자 버리기

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLine().split("");
            }

            for (int i = 0; i < n; i++) {
                for (int j = m - 1; j >= 0; j--) {
                    sb.append(arr[i][j]);
                }
                sb.append("\n");
            }
            System.out.println(sb);
        }
    }
}