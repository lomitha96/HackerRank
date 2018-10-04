 
import java.util.*; 

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        String[] numberString = new String[n];

        for(int i = 0; i<n; i++){
            numberString[i] = String.valueOf(scan.nextInt());
        }

        for(int i = 0; i<n; i++){
            System.out.println(findDigits(numberString[i]));
        }
    }

    static int findDigits(String numberString ) {

        int number = Integer.parseInt(numberString);
        int count =0;

        for(int i = 0; i<numberString.length(); i++){
            int temp = Character.getNumericValue(numberString.charAt(i));
            if(temp!=0&&number%temp==0){
                count++;
            }
        }
        return count;
    }
}
