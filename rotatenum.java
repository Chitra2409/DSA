import java.util.*;

public class rotatenum {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int temp=n;
        int count =0;
        while(temp>0){
            temp=temp/10;
            count++;
        }

        k= k%count;// for managing large numbers
        if(k<0){
            k= k+count;// for managing the negative rotations
        }
        int mult=1;
        int div=1;
        for(int i=1;i<=count;i++){
            if(i<=k){
                div=div*10;
            }else{
                mult=mult*10;
            }
        }
        int q= n/div;
        int r = n%div;

        int result = r*mult+q;
        System.out.println(result);

    }
    
}
