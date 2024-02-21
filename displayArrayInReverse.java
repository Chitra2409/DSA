package Recursion;
import java.lang.reflect.Array;
import java.util.*;
public class displayArrayInReverse {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        ArrayDisplayInReverse(arr, 0);

    }
    //idx se n tak sb elements display kara dega
    public static void ArrayDisplayInReverse(int[] arr,int idx){
        if(idx==arr.length){
            return;
        }
        
        ArrayDisplayInReverse(arr, idx+1);
        System.out.println(arr[idx]);

    }
}
