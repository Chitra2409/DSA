import java.util.*;

public class lcm_hcf {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        int oa=a;
        int ob=b;
        while(a%b!=0){
            int rem = a%b;
            a=b;
            b= rem;
        }
        int gcd=b;
        System.out.println(gcd);
        int lcm = (oa*ob)/gcd;
        System.out.println(lcm);
    }
    
}
