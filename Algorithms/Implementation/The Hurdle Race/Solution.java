 
import java.util.*; 

public class Solution {

    static int hurdleRace(int k, int[] height) {

        int max =0;

        for(int i = 0; i<height.length; i++){
            if(height[i]>max){
                max=height[i];
            }
        }

        if (max>k){
            return (max-k);
        }

        return 0;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] height = new int[n];

        for(int i =0; i<n; i++){
            height[i] = scan.nextInt();
        }

        System.out.println(hurdleRace(k, height));

    }
}
