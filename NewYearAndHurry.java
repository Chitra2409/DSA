import java.util.*;
 
public class NewYearAndHurry {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int time = 0;
        int solvedProblems = 0;
        for (int i = 1; i <= n; i++) {
            time += 5 * i;
            int timeLeft = 240 - k;
            if (timeLeft >= time) {
                solvedProblems++;
            } else {
                break;
            }
        }
        
        System.out.println(solvedProblems);
    }
}
