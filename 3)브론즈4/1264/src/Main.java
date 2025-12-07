import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                int result = 0;
                String[] arr = sc.nextLine().split("");

                if (arr[0].equals("#")) {
                    break;
                }
                for (String str : arr) {
                    if (str.equals("a") || str.equals("e") || str.equals("o") || str.equals("u") || str.equals("i")) {
                        result += 1;
                    }
                    if (str.equals("A") || str.equals("E") || str.equals("O") || str.equals("U") || str.equals("I")) {
                        result += 1;
                    }
                }
                System.out.println(result);
            } catch (Exception e) {
                break;
            }
        }

    }
}