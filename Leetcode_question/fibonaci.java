package Leetcode_question;

public class fibonaci {
    public static int fin(int n){
        if(n==0 || n ==1){
            return n;
        }
        return fin(n-1)+fin(n-2);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fin(n));
    }
}
