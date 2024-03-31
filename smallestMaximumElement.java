import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */     
        Scanner sc= new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            
            if(n <= k)
                System.out.println((k + n - 1) / n);
            else
                System.out.println(1 + (n % k > 0 ? 1 : 0));
        }
    }
}
