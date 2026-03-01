package Bronze5.BOJ27219;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        String result = "V".repeat(y/5);

        result = result + "I".repeat(y%5);

        System.out.println(result);
    }
}

