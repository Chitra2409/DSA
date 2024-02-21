package Recursion;
import java.util.*;
public class towerOfHanoi {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int t1d=sc.nextInt();
        int t2d=sc.nextInt();
        int t3d=sc.nextInt();
        TOH(n, t1d, t2d, t3d);
    }
    public static void TOH(int n, int t1id, int t2id, int t3id ){
        if(n==0){
            return;
        }
        TOH(n-1,t1id,t3id,t2id);
        System.out.println(n + "[" + t1id + " -> " + t2id + "]");
        TOH(n-1,t3id,t2id,t1id);

    }
    
}
