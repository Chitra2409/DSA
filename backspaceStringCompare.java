//Question link- https://leetcode.com/problems/backspace-string-compare/

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> S = new Stack<>();
        Stack<Character> T = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '#'){
                if(S.size() !=0){
                    S.pop();
                }
            }else{
                S.push(ch);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(ch == '#'){
                if(T.size() !=0){
                    T.pop();
                }
            }else{
                T.push(ch);
            }
        }
        if(S.equals(T)){
            return true;
        }
        return false;    
    }
}
