package Recursion;
import java.util.Scanner;
public class firstIndexOfOccurence {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int occur= firstOccurence(arr, 0,8);
        System.out.println(occur);
    }
    public static int firstOccurence(int[] arr,int idx,int d){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==d){
            return idx;
        }
        else{
            int occ = firstOccurence(arr, idx+1, d);
            return occ;
        }
        
        

    }
    
}
