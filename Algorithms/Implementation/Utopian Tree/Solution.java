import java.util.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static int utopianTree(int n) {

        int height = 1;

        for(int i = 0; i<n; i++){
            if(i!=0&&i%2==0){
                height = height*2;
            }else {
                height++;
            }
        }

        return height;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        int[] period = new int[n];

        for(int i = 0; i<n; i++){
            period[i] = scanner.nextInt();
        }

        for(int i = 0; i<n; i++){
            System.out.println(utopianTree(period[i]));
        }

    }
}
