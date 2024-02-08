public class StringConcatenation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
      
        int length = str1.length() + str2.length();
        char[] result = new char[length];
        for (int i = 0; i < str1.length(); i++) {
            result[i] = str1.charAt(i);
        }
      
        for (int i = 0; i < str2.length(); i++) {
            result[str1.length() + i] = str2.charAt(i);
        }
        
        String concatenatedString = new String(result);
        System.out.println(concatenatedString);
    }
}
