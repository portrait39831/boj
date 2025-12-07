import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");

        int result = arr.length;

        if (result != 0) {
            if (arr[0].isBlank()) {
                result -= 1;
            }
            if (arr[arr.length - 1].isBlank()) {
                result -= 1;
            }
        }

        System.out.println(result);
    }
}
