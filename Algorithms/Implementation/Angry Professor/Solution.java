import java.util.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void angryProfessor(List<Integer> student, int minimumStudent) {

        int attendance = 0;

        for(int i = 0; i<student.size(); i++){
            if(student.get(i)<=0){
                attendance++;
            }
        }

        if(minimumStudent<=attendance){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        //Declare your two dimensional ArrayList of Strings.
        ArrayList< ArrayList<Integer>> student = new ArrayList<>();
        ArrayList minimumAttendance = new ArrayList();

        for(int i = 0; i<n; i++){
            int t = scanner.nextInt();
            student.add(new ArrayList<>());
            minimumAttendance.add(scanner.nextInt());

            for(int j = 0; j<t; j++){
                student.get(i).add(scanner.nextInt());
            }
        }

        for(int i = 0; i<n; i++){
            angryProfessor(student.get(i), (Integer) minimumAttendance.get(i));
        }

    }
}
