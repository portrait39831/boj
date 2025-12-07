import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n != 0 && m != 0) {
            sc.nextLine(); //개행문자 제거

            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                for (int j = 0; j < m; j++) {
                    sb.append(line.charAt(m - j - 1));
                }
                sb.append("\n");
            }
            System.out.println(sb);
        }
    }
}