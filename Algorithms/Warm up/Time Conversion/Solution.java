
import java.util.*; 

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] time = new String[10];

        for(int i = 0; i<10; i++){
            time[i] = Character.toString(s.charAt(i));
        }

        String hours = time[0]+time[1];

        String minutes = time[3]+time[4];

        String seconds = time[6]+time[7];

        String amPm = time[8]+time[9];


        if(amPm.equals("PM")&&(Integer.parseInt(hours)!=12)){
            int temp = Integer.parseInt(hours);
            hours = Integer.toString(temp+12);
        }
        else if (amPm.equals("AM")&&Integer.parseInt(hours)==12){
            hours = "00";
        }

        String militaryTime = hours+":"+minutes+":"+seconds;
        return militaryTime;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        String s = scan.nextLine();

        String result = timeConversion(s);

        System.out.println(result);
    }
}
