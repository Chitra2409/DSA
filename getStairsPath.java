package Recursion;
import java.util.*;
public class getStairsPath {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<String> result = getSP(n);
        System.out.println(result);
    }
    public static ArrayList<String> getSP(int n){
        if(n==0){//0 se 0 ka ek rasta hota hai ki chalo hi mat
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;
        }else if(n<0){// neg num jaise ki -1 se koi rasta nahi hota
            ArrayList<String> bres= new ArrayList<>();
            return bres;
        }
        ArrayList<String> paths1= getSP(n-1);
        ArrayList<String> paths2= getSP(n-2);
        ArrayList<String> paths3= getSP(n-3);
        
        ArrayList<String> paths= new ArrayList<>();

        for(String path: paths1){
            paths.add(1+path);
        }
        for(String path: paths2){
            paths.add(2+path);
        }
        for(String path: paths3){
            paths.add(3+path);
        }

        return paths;

    }
    
}
