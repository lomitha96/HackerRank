import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int result =0;

        for(int i=0; i<count; i++){
            result += sc.nextInt();
        }
        System.out.println(result);
    }
}
