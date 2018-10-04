 
import java.util.*; 

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int[] value = new int[26];

        for (int i =0; i<26; i++){
            value[i] = scan.nextInt();
        }

        String word = scan.next();
        int[] charValue = new int[word.length()];

        for(int i =0; i<word.length(); i++){
            charValue[i] = value[word.charAt(i)-97];
        }

        int maxHeight = 0;
        for(int i =0; i<word.length(); i++){
            if(charValue[i]>maxHeight){
                maxHeight = charValue[i];
            }
        }

        int selectionArea = word.length()*maxHeight;

        System.out.println(selectionArea);

    }
}
