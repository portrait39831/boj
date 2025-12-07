    import java.util.*;

    //에라토스테네스의 체 idea
    public class Main2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int result = 0;
            int n = Integer.parseInt(sc.nextLine());

            boolean[] sieve = new boolean[1000];

            sieve[0] = true;

            for (int i = 1; i < 1000; i++) {
                if (!sieve[i]) {
                    for (int j = 2; j <= 1000 / (i + 1); j++) {
                        sieve[j * (i + 1) - 1] = true;
                    }
                }
            }

            String[] arr = sc.nextLine().split(" ");

            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(arr[i]);
                if (!sieve[num - 1]) {
                    result += 1;
                }
            }

            System.out.println(result);
        }
    }
