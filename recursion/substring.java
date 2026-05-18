package recursion;

public class substring {
    public static int  substring(String str , int i, int j){
          if(i>j){
            return 0;
          }
           int res = substring(str, i+1, j) + substring(str, i, j-1)- substring(str, i+1, j-1);
           if(str.charAt(i)== str.charAt(j)){
            res++;
           }
           return res;

}
    public static void main(String[] args) {
        String str = "aba";
        int n = str.length();
        int result = substring (str, 0, n-1 );
        System.out.println("The number of palindromic substrings is: " + result);
    }
}
