import java.util.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int appleCount = 0;
        int orangeCount = 0;

        for(int i = 0; i<apples.length; i++){
            int temp = apples[i]+a;
            if(s<=temp&&t>=temp){
                appleCount++;
            }
        }

        for(int i = 0; i<oranges.length; i++){
            int temp = oranges[i]+b;
            if(s<=temp&&t>=temp){
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int s = scanner.nextInt();
        int t = scanner.nextInt();

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[] apples = new int[m];
        for (int i = 0; i < m; i++) {
            apples[i] = scanner.nextInt();
        }

        int[] oranges = new int[n];
        for (int i = 0; i < n; i++) {
            oranges[i] = scanner.nextInt();
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}
