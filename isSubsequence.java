//Question link- https://leetcode.com/problems/is-subsequence/

//Time complexity- O(n)
//Approach explaination- https://leetcode.com/problems/is-subsequence/solutions/4507446/o-n-java-solution/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0; // Pointers for s and t

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // Move pointer in s when characters match
            }
            j++; // Always move pointer in t
        }
        return i == s.length(); 
        
    }
}
