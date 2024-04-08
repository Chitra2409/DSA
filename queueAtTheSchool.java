import java.util.*;
 
public class QueueAtTheSchool {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
 
        StringBuilder sb = new StringBuilder(str); 
        
        for(int j=0;j<m;j++){
            for (int i = 0; i < length - 1; i++) {
                if (sb.charAt(i) == 'B' && sb.charAt(i + 1) == 'G') {
                    sb.setCharAt(i, 'G');
                    sb.setCharAt(i + 1, 'B');
                    i++;
                }
            }
            
        }
 
        System.out.println(sb.toString());
    }
}
