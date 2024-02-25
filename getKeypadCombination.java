package Recursion;
import java.util.*;
public class getKeypadCombination {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        ArrayList<String> words= getKPC(str);
        System.out.println(words );
    }
    static String[] codes= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str){
        if(str.length()==0){
            ArrayList<String> arr= new ArrayList<>();
            arr.add("");
            return arr;
        }
        
        //678 input ke lie
        char ch= str.charAt(0);//6
        String ros= str.substring(1);//78

        ArrayList<String> rres= getKPC(ros);//6 words of 78
        ArrayList<String> mres = new ArrayList<>();//24 words for 678
        String codeforch= codes[ch-'0'];
        for(int i=0;i<codeforch.length();i++){
            char chcode= codeforch.charAt(i);
            for(String rstr: rres){
                mres.add(chcode+rstr);
            }
        }
        
        return mres;
    }
    
}

