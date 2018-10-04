 
import java.util.*; 

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        int k = scan.nextInt();

        int[] c = new int[n];

        for(int i = 0; i<n; i++){
            c[i] = scan.nextInt();
        }

        int energy = 100;

        for(int i = 0; i<n; i +=k){
            if(c[i]==0){
                energy--;
            }else{
                energy -=3;
            }
        }

        System.out.println(energy);
    }
}
