import java.util.*;
public class allprime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for(int i = low; i<=high; i++){
            int count=0;
            System.out.println(i);
            for(int j =2;j*j<=i;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
        }
    }
    
}
