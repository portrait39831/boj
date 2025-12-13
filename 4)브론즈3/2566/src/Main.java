import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];

        int max = 0;
        int row = 0;
        int column = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int item = sc.nextInt();
                arr[j][i] = item;
                //j가 열, i가 행 (1열, 2열, ..., 9열) << 1행, (1열, 2열, ..., 9열) << 2행 ...

                if (item > max) {
                    max = item;
                    row = i;
                    column = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((row + 1) + " " + (column + 1));
    }
}
