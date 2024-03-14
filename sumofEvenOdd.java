import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = sum(n);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] sum(int n) {
        int temp = n;
        int evensum = 0;
        int oddsum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            if (rem % 2 == 0) {
                evensum += rem;
            } else {
                oddsum += rem;
            }
            temp = temp / 10;
        }
        return new int[]{evensum, oddsum};
    }
}
