    import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String[] arr = sc.nextLine().split("");
            int[] result = new int[26];
            for (String s : arr) {
                result[s.charAt(0)-97] += 1;
            }

            for (int n : result) {
                System.out.print(n + " ");
            }
        }
    }
