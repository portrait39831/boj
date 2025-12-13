import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String track = sc.next();

            if (track.equals("C")) {
                arr[0] += 1;
            }
            else if (track.equals("S")) {
                arr[1] += 1;
            }
            else if (track.equals("I")) {
                arr[2] += 1;
            }
            else {
                arr[3] += 1;
            }
        }

        String input = sc.next();

        int result;
        if (input.equals("C")) {
            result = arr[0];
        }
        else if (input.equals("S")) {
            result = arr[1];
        }
        else if (input.equals("I")) {
            result = arr[2];
        }
        else {
            result = arr[3];
        }

        System.out.println(result);
    }
}
