import java.util.*;
public class anybaseaddition {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int b1= sc.nextInt();
        int b2= sc.nextInt();
        int result = getSum(n,b1,b2);
        System.out.println(result);

        }
        public static int getSum(int b, int n1, int n2){
            int rv = 0;
            int c =0;//carry
            int p=1;
            while(n1>0 ||n2>0||c>0){
                int d1= n1%10;
                int d2 = n2%10;
                n1= n1/10;
                n2= n2/10;
                
                int d = d1+d2+c;
                c= d/b;
                d=d%b;

                rv +=d*p;
                p= p*10;
            }
            return rv;
        }
    }
    

