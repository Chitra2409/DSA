import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long h = sc.nextLong();

        long evenSum = (h / 2) * (h / 2 + 1) - ((l - 1) / 2) * ((l - 1) / 2 + 1);
        long oddSum = ((h + 1) / 2) * ((h + 1) / 2) - (l / 2) * (l / 2);

        long result = Math.abs(evenSum - oddSum);
        System.out.println(result); 
    }
}
