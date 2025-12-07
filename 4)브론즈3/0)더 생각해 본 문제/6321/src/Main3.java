import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb;
        String name;

        int n = Integer.parseInt(sc.nextLine());

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            sb = new StringBuilder();
            name = sc.nextLine();

            for (int j = 0; j < name.length(); j++) {
                sb.append(name.charAt(j) + 1 == 91
                        ? 'A'
                        : (char)(name.charAt(j) + 1));
            }
            arr[i] = String.valueOf(sb);
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("String #%d\n%s\n\n", i + 1, arr[i]);
        }
    }
}
