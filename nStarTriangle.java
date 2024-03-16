public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }   
        }for(int i=n-1;i>0;i--){
            System.out.println();
            for(int j=0;j<i;j++){
                System.out.print("*");
            }   
        }
        

    }
}
