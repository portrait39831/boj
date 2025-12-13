import java.util.*;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        int temp;
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();

            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

    }
}
