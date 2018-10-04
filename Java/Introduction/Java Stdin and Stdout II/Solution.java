
import java.util.*; 

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N%2!=0){
            System.out.println("Weird");aimport java.util.Scanner;

            public class Solution {

                public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);
                    int i = scan.nextInt();
                    Double d = scan.nextDouble();
                    scan.nextLine();
                    String s = scan.nextLine();

                    // Write your code here.

                    System.out.println("String: " + s);
                    System.out.println("Double: " + d);
                    System.out.println("Int: " + i);
                }
            }
        }
        else if(N>=2&&N<5){
            System.out.println("Not Weird");
        }
        else if(N<=20){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }


        scanner.close();
    }
}
