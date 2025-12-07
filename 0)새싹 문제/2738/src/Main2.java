import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        //1행의 모든 열 채우고 2행의 모든 열 채우고 이런 식으로 해야하니까 m(열)을 먼저 채워야 함 n(행)말고
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        //1행의 모든 열 채우고 2행의 모든 열 채우고 이런 식으로 해야하니까 m(열)을 먼저 채워야 함 n(행)말고
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        //1행의 모든 열 출력하고 2행의 모든 열 출력하고 이런 식으로 해야하니까 m(열)을 먼저 채워야 함 n(행)말고
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }



    }
}