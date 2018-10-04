 
import java.util.*;

public class Solution {

    static int grade(int marks) {
        if(marks>37){
            if((((marks/5+1)*5)-marks)<3){
                marks = (marks/5+1)*5;
            }
        }

        return marks;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            marks[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(grade(marks[i]));
        }

    }
}
