import java.util.*;
public class decimaltobase {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int b= sc.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
        
    }
    public static int getValueInBase(int n, int b){
        int rv=0;
        int p=1;
        while(n>0){
            int rem = n%b;
            n=n/b;

            rv+= rem*p;
            p=p*10;
        }

        return rv;
    }
}
