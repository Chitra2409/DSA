import java.util.*;
public class basetodecimal {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int b= sc.nextInt();
        int dn = getValueInDecimal(n, b);
        System.out.println(dn);
    }
    public static int getValueInDecimal(int n, int b){
        int rv=0;
        int p=0;
        while(n>0){
            int rem= n%10;
            n=n/10;

            int div = (int)Math.pow(b,p);
            rv += rem*div;
            p++;
        }

        return rv;
    }
}
