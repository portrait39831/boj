package Bronze5.BOJ30224;

import java.util.*;

class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String[] arr = (num + "").split("");

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("7")) {
                result = 2;
            }
        }
        if (num % 7 == 0) {
            result += 1;
        }


        System.out.println(result);
    }
}