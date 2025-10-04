import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String[] team = sc.nextLine().split("");

            for (String str : team) {
                if (str.equals("e")) {
                    str = "i";
                }
                else if (str.equals("i")) {
                    str = "e";
                }
                else if (str.equals("E")) {
                    str = "I";
                }
                else if (str.equals("I")) {
                    str = "E";
                }

                System.out.print(str);
            }
            System.out.println();
        }

    }
}
