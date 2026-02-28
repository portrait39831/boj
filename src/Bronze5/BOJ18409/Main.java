package Bronze5.BOJ18409;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//TODO : nextLine은 그냥 nextInt 쓰면 Int 이후 줄바꿈 문자를 읽을 수 있음
        int n = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split("");

        int result = 0;

        for (int i = 0; i < n; i++) {
            if (str[i].equals("a")) {
                result += 1;
            }
            else if (str[i].equals("e")) {
                result += 1;
            }
            else if (str[i].equals("i")) {
                result += 1;
            }
            else if (str[i].equals("o")) {
                result += 1;
            }
            else if (str[i].equals("u")) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}


