import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = 0;

            switch (a % 10) {
                case 0:
                    result = 10;
                    break;
                case 1:
                    result = 1;
                    break;
                case 2:
                    switch (b % 4) {
                        case 1:
                            result = 2;
                            break;
                        case 2:
                            result = 4;
                            break;
                        case 3:
                            result = 8;
                            break;
                        case 0:
                            result = 6;
                            break;
                    }
                    break;
                case 3:
                    switch (b % 4) {
                        case 1:
                            result = 3;
                            break;
                        case 2:
                            result = 9;
                            break;
                        case 3:
                            result = 7;
                            break;
                        case 0:
                            result = 1;
                            break;
                    }
                    break;
                case 4:
                    result = b % 2 == 1 ? 4 : 6;
                    break;
                case 5:
                    result = 5;
                    break;
                case 6:
                    result = 6;
                    break;
                case 7:
                    switch (b % 4) {
                        case 1:
                            result = 7;
                            break;
                        case 2:
                            result = 9;
                            break;
                        case 3:
                            result = 3;
                            break;
                        case 0:
                            result = 1;
                            break;
                    }
                    break;
                case 8:
                    switch (b % 4) {
                        case 1:
                            result = 8;
                            break;
                        case 2:
                            result = 4;
                            break;
                        case 3:
                            result = 2;
                            break;
                        case 0:
                            result = 6;
                            break;
                    }
                    break;
                case 9:
                    result = b % 2 == 1 ? 9 : 1;
                    break;
            }

            System.out.println(result);
        }

    }
}
