package Bronze5.BOJ26489;

import java.util.*;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int result = 0;

        try {
            while (true) {
                String str = sc.nextLine(); //sc.hasNext가 FALSE인데 읽으려고 하면 예외 발생

                if (str.isEmpty()) {
                    break;
                }
                else {
                    result += 1;
                }
            }
            System.out.println(result);
        } catch (NoSuchElementException e) {
            System.out.println(result);
        }

    }
}

