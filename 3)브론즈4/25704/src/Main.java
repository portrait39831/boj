import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();

        int result;

        if (n < 5) {
            result = p;
        }
        else if (n < 10) {
            if (p <= 500) {
                result = 0;
            }
            else{
                result = p - 500;
            }
        }
        else if (n < 15) {
            if (p <= 500) {
                result = 0;
            }
            else if (p <= 5000) {
                result = p - 500;
            }
            else {
                result = p * 9/10;
            }
        }
        else if (n < 20) {
            if (p <= 2000) {
                result = 0;
            }
            else if (p <= 20000) {
                result = p - 2000;
            }
            else {
                result = p * 9/10;
            }
        }
        else {
            if (p <= 2000) {
                result = 0;
            }
            else if (p <= 8000) {
                result = p - 2000;
            }
            else {
                result = p * 3/4;
            }
        }
        System.out.println(result);
    }
}