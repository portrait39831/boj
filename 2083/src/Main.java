import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String group;
        while (true) {
            String[] arr = sc.nextLine().split(" ");

            if (arr[0].equals("#")) {
                break;
            }

            if (Integer.parseInt(arr[1]) > 17 || Integer.parseInt(arr[2]) >= 80) {
                group = "Senior";
            }
            else {
                group = "Junior";
            }

            System.out.printf("%s %s\n",arr[0],group);
        }
    }
}
