import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] hex = sc.nextLine().split("");
        long digit = 1;
        long result = 0;

        for (int i = hex.length - 1; i >= 0; i--) {
            if (hex[i].equals("A")) {
                result += 10 * digit;
            }
            else if (hex[i].equals("B")) {
                result += 11 * digit;
            }
            else if (hex[i].equals("C")) {
                result += 12 * digit;
            }
            else if (hex[i].equals("D")) {
                result += 13 * digit;
            }
            else if (hex[i].equals("E")) {
                result += 14 * digit;
            }
            else if (hex[i].equals("F")) {
                result += 15 * digit;
            }
            else {
                result += Integer.parseInt(hex[i]) * digit;
            }

            digit *= 16;
        }

        System.out.println(result);
    }
}
