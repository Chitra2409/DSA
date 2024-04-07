import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chest = 0;
        int bicep = 0;
        int back = 0;
        for (int i = 0; i < n; i++) {
            int exercises = sc.nextInt();
            if (i % 3 == 0)
                chest += exercises;
            else if (i % 3 == 1)
                bicep += exercises;
            else
                back += exercises;
        }
        if (chest >= bicep && chest >= back)
            System.out.println("chest");
        else if (bicep >= chest && bicep >= back)
            System.out.println("biceps");
        else
            System.out.println("back");
    }
}
