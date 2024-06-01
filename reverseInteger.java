class Solution {
    public int reverse(int x) {
        String str= String.valueOf(x);

        boolean isNegative=false;
        if(x<0){
            isNegative=true;
            str= str.substring(1);
        }
        StringBuilder revStr= new StringBuilder(str).reverse();

        try {
            long reversed = Long.parseLong(revStr.toString());
            if (isNegative) {
                reversed = -reversed;
            }
            if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
                return 0; 
            } else {
                return (int) reversed;
            }
        } catch (NumberFormatException e) {
            return 0;
        }

    }
}
