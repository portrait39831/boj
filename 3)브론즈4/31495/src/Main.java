import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] arr = s.split("");

        try {
            if (arr[0].equals("\"")) {
                if(arr[arr.length-1].equals("\"")){
                    arr = s.split("\"");
                    System.out.println(arr[1]);
                }

                else {
                    System.out.println("CE");
                }
            }
            else {
                System.out.println("CE");
            }
        } catch(Exception e){
            System.out.println("CE");
        }


    }
}
