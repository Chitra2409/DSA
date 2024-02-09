import java.util.*;
public class digitsfrequency {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        long n= sc.nextInt();
        int d= sc.nextInt();
        int count=0;
        while(n !=0){
            long r = n%10;
            if(r==d){
                count++;
            } 
            n=n/10;
        }
        System.out.println(count);
    }
    
}
