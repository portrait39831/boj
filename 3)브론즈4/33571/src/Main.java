import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] s = sc.nextLine().toCharArray();

        int result = 0;
        for (char c : s) {
            if (c == 'a' || c == 'b' || c == 'd' || c == 'e' || c == 'g' || c == 'o' || c == 'p' || c == 'q') {
                result += 1;
            }
            else if (c == 'A' || c == 'D' || c == 'O' || c == 'P' || c == 'Q' || c == 'R') {
                result += 1;
            }
            else if (c == 'B') {
                result += 2;
            }
            else if (c == '@') {
                result += 1;
            }
        }

        System.out.println(result);
    }
}
