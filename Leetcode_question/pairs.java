package Leetcode_question;

public class pairs {
    public static int paired(int n){
        if (n == 1 || n == 2){
            return n;
        }
        return paired(n-1) + (n-1)*paired(n-2);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(paired(n));
    }
}
