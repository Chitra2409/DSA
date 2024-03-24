import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = armstrong(n);
        System.out.println(result);
    }

    public static boolean armstrong(int n) {
        int numberOfDigits = String.valueOf(n).length();
        int temp = n;
        long sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, numberOfDigits);
            temp = temp / 10;
        }
        return sum == n;
    }
}
