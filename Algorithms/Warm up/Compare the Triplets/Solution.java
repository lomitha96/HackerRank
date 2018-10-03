import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[] aliceArray = new int[3];
        int[] bobArray = new int[3];
        int alicePoint =0;
        int bobPoint =0;

        for(int i = 0; i<3; i++){
            aliceArray[i] = in.nextInt();
        }

        for(int i = 0; i<3; i++){
            bobArray[i] = in.nextInt();
        }

        for(int i = 0; i<3; i++){
            if(aliceArray[i]>bobArray[i]){
                alicePoint +=1;
            }
            else if(aliceArray[i]<bobArray[i]){
                bobPoint +=1;
            }
        }

        System.out.print(alicePoint+" ");
        System.out.print(bobPoint);
    }
}
