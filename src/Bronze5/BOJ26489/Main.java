package Bronze5.BOJ26489;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        while(sc.hasNext()) {
            String str = sc.nextLine();

            if (str.isEmpty()) {
                break;
            }
            else {
                result += 1;
            }
        }
        System.out.println(result);
    }
}

