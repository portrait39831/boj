import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr[0] + " " + arr[n-1]);
    }
}

//sort해서 찾으면 sort가 n log n의 시간 복잡도를 가짐
//그래서 별로 좋은 방법은 아님 그냥 순회하면 O(n)에 풀 수 있으니까
