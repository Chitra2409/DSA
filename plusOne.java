//Question link - https://leetcode.com/problems/plus-one/description/

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++; 
            return digits;
        }
        digits[i] = 0;
    }
    
    int[] newArray = new int [n+1];
    newArray[0] = 1;
    return newArray;
}
}

/*Explaination
    If the loop completes without returning, it means that all the digits were 9. 
    In this case, it creates a new array newNumber with a length one greater than the original array. 
    It sets the first element of newNumber to 1, representing the carry, and the rest of the elements remain 0. 
    This is because adding 1 to a number composed entirely of 9s will result in carrying over to the next place value.
*/
