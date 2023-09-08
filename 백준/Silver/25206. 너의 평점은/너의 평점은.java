import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        double totalK = 0.0;
        double temp = 0.0;
        double answer = 0.0;

        for(int i=0; i<20; i++){

            String[] s = sc.nextLine().split(" ");

            if(!s[2].equals("P")){
                double k = Double.parseDouble(s[1]);
                double grade = gradeMap.getOrDefault(s[2], 0.0);

                totalK += k;
                temp += (k*grade);
            }
        }

        answer = temp/totalK;
        System.out.println(answer);
    }
}