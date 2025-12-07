import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String s =  sc.nextLine();

        int startIndex = 0;

        for (int i = 0; i < 10; i++) {

            if (startIndex + 10 > s.length()) {
                break;
            }

            for (int j = 0; j < 10; j++) {
                sb.append(s.charAt(startIndex + j));
            }
            sb.append("\n");

            startIndex += 10;
        }

        for (int i = startIndex; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }

        System.out.println(sb);
    }
}
