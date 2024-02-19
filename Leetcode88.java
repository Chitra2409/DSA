class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            x=1/x;
            n=-n;
        }
        
        return power(x,n);
    }
    public double power(double x, int n){
        if(n==0){
            return 1;
        }

        double res= power(x,n/2);

        if(n%2==0){
            return res*res;
        }else{
            return res*res*x;
        }
    }
}
