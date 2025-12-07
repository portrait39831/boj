import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] student = new int[30];
        Arrays.fill(student, 0);

        for (int i = 0; i < 28; i++) {
            student[sc.nextInt()-1] = 1;
        }

        for (int i = 0; i < 30; i++) {
            if (student[i] == 0) {
                System.out.println(i+1);
            }
        }

    }
}
