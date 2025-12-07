import java.util.*;

public class Main {
    public static void main(String[] args) {
        final double bob = 31.5;
        int alice;

        int check = 0;

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[20];

        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 20) {
                check = i;
            }
        }

        if (check == 0) {
            alice = arr[0] + arr[1] + arr[19];
        }
        else if (check == 19) {
            alice = arr[0] + arr[19] + arr[18];
        }
        else {
            alice = arr[check] + arr[check-1] + arr[check+1];
        }

        if (bob > alice) {
            System.out.println("Bob");
        }
        else if (bob < alice) {
            System.out.println("Alice");
        }
        else {
            System.out.println("Tie");
        }

    }
}
