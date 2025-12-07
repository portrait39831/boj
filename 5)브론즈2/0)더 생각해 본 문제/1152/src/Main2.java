import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().strip().split(" ");

        System.out.println(arr[0].isBlank()
                        ? 0
                        : arr.length);
    }
}
