import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.next().split("");

        int doNotSpace = 0;

        for (String i : n) {
            doNotSpace += 1;

            switch (i){
                case "0":
                    System.out.print("0000\n0  0\n0  0\n0  0\n0000");
                    break;
                case "1":
                    System.out.print("   1\n   1\n   1\n   1\n   1");
                    break;
                case "2":
                    System.out.print("2222\n   2\n2222\n2\n2222");
                    break;
                case "3":
                    System.out.print("3333\n   3\n3333\n   3\n3333");
                    break;
                case "4":
                    System.out.print("4  4\n4  4\n4444\n   4\n   4");
                    break;
                case "5":
                    System.out.print("5555\n5\n5555\n   5\n5555");
                    break;
                case "6":
                    System.out.print("6666\n6\n6666\n6  6\n6666");
                    break;
                case "7":
                    System.out.print("7777\n   7\n   7\n   7\n   7");
                    break;
                case "8":
                    System.out.print("8888\n8  8\n8888\n8  8\n8888");
                    break;
                case "9":
                    System.out.print("9999\n9  9\n9999\n   9\n   9");
                    break;
            }

            if (doNotSpace != n.length) {
                System.out.println("\n");
            }
        }
    }
}
