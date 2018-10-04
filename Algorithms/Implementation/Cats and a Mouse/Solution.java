 
import java.util.*;

public class Solution {

    static void catAndMouse(int[] ar) {

        int catA = Math.abs(ar[2]-ar[0]);
        int catB = Math.abs(ar[2]-ar[1]);

        if(catA==catB){
            System.out.println("Mouse C");
        }else if(catA<catB){
            System.out.println("Cat A");
        }else{
            System.out.println("Cat B");
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        int[][] ar = new int[n][3];

        for(int i =0; i<n; i++){
            for (int j = 0; j < 3; j++) {
                ar[i][j] = scan.nextInt();
            }
        }

        for(int i =0; i<n; i++){
            catAndMouse(ar[i]);
        }

    }
}
