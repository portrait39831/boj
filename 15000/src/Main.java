import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.next().split("");

        //그냥 UpperCase 아니라 toUpperCase임;;
        for (String str : arr) {
            System.out.print(str.toUpperCase());
        }
    }
}
