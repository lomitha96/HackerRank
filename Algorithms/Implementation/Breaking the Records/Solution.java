 
import java.util.*; 

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int games = scan.nextInt();
        long[] scores = new long[games];

        for (int i =0; i<games; i++){
            scores[i] = scan.nextLong();
        }

        long highestScore = scores[0];
        long lowestScore = scores[0];
        int highestCount = 0;
        int lowestCount = 0;

        for (int i =0; i<games; i++){
            if(scores[i] > highestScore){
                highestScore = scores[i];
                highestCount++;
            }

            if(scores[i] < lowestScore){
                lowestScore = scores[i];
                lowestCount++;
            }
        }

        System.out.println(highestCount+" "+lowestCount);

    }
}
