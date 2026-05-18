package backtracking;

public class findSubset {

    public static void subset(String str, String ans,int i){
        //base case
        if(i == str.length()){
            System.out.print(ans);
            return;
        }
        //include
        subset(str, ans+str.charAt(i), i+1);

        //exclude
         subset(str, ans, i+1);
    }
    public static void main(String[] args) {
        subset("abc", "", 0);
    }
}
