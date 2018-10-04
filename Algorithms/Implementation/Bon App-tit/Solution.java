 
import java.util.*; 

public class Solution {

    static void bonAppetit(int[] ar, int k, int b) {

        int billAnna  =0;

        for(int i=0; i<ar.length; i++) {
            if (i != k) {
                billAnna  += ar[i];
            }
        }

        billAnna = billAnna/2;

        if (b==billAnna){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(b-billAnna);
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }

        int b = scan.nextInt();

        bonAppetit(ar, k, b);

    }
}
