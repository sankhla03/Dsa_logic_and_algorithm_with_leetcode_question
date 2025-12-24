package Leetcode_question;

public class polindrom {
    public static boolean polidrom(String str){
        int n = str.length();
        String str1 = str.toUpperCase();
        for (int i = 0; i<n/2; i++ ){
          if(str1.charAt(i) == (str1.charAt(n-i-1))){
            return true;
        }    
        }
        
        return false;
    }
    public static void main(String[] args) {
        String racecAr;
        System.out.println(polidrom("MADAM"));
    }
    
}
