import java.util.*;
 
public class Presents {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] giftGivers = new int[n];
        
        for (int i = 0; i < n; i++) {
            giftGivers[i] = sc.nextInt();
        }
        
        int[] presents = new int[n];
        
        for (int i = 0; i < n; i++) {
            int friendPosition = i + 1;
            int inversePosition = giftGivers[i];
            presents[inversePosition - 1] = friendPosition;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(presents[i] + " ");
        }
    }
}
