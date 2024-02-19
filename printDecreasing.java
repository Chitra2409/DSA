package Recursion;
import java.util.*;
public class printDecreasingIncreasing {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        // printDec(n);
        // printInc(n);

    }
    /*public static void printDec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==0){
            return;
        }
        printInc(n-1);
        System.out.println(n);
        
    }*/

    //instead of calling both the functions separately, what we can do is given below
    public static void pdi(int n){
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }

    
}
