import java.util.*;
public class npr {
    public static int fact(int x){
        int result= 1;
        for(int i=1;i<=x;i++){
            result *=i;
        }
        return result;
        
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int r = sc.nextInt();
        
        // int nfact= 1;
        // for(int i=1;i<=n;i++){
        //     nfact= nfact*i;
        // }

        // int nmrfact=1;
        // for(int i=1;i<=n-r;i++){
        //     nmrfact*=i;
        // }

        int nfact= fact(n);
        int nmrfact = fact(n-r);
        
        int npr = nfact/nmrfact;
        System.out.println(npr);
    }        
}
    

