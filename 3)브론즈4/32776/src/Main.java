import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        int ma = sc.nextInt();
        int f = sc.nextInt();
        int mb = sc.nextInt();

        if (s <= 240) {
            System.out.println("high speed rail");
        }
        else {
            if (s <= ma + f + mb) {
                System.out.println("high speed rail");
            }
            else {
                System.out.println("flight");
            }
        }
    }
}
