package Leetcode_question;

public class numberTostring {
    static String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    public static void numberTostring(int num){
        if(num == 0){
            return;
        }
        int lastdigit = num%10;
        numberTostring(num/10);

        System.out.print(belowTwenty[lastdigit] + " ");
    }
    public static void main(String[] args) {
        int num = 12345;
        numberTostring(num);
    }
}
