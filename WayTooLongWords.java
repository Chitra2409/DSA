import java.util.*;
 
public class WayTooLongWords {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            int length = str.length();
            if (length <= 10) {
                System.out.println(str);
            } else {
                System.out.println(str.charAt(0) + Integer.toString(length - 2) + str.charAt(length - 1));
            }
        }
    }
}
