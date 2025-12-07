import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr;

        arr = sc.nextLine().split(" ");
        int AP_A = Integer.parseInt(arr[0]);
        int HP_A = Integer.parseInt(arr[1]);

        arr = sc.nextLine().split(" ");
        int AP_B = Integer.parseInt(arr[0]);
        int HP_B = Integer.parseInt(arr[1]);

        while(true) {
            HP_A = HP_A - AP_B;
            HP_B = HP_B - AP_A;

            if (HP_A <= 0 && HP_B <= 0) {
                System.out.println("DRAW");
                break;
            }
            //A가 사망 == B가 우승
            else if (HP_A <= 0) {
                System.out.println("PLAYER B");
                break;
            }
            //B가 사망 == A가 우승
            else if (HP_B <= 0) {
                System.out.println("PLAYER A");
                break;
            }
        }
    }
}
