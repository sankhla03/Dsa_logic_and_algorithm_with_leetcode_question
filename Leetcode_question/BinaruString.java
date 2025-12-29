package Leetcode_question;

public class BinaruString {
    public static void binaryString(int n, StringBuilder s,int lastplace){
        if(n ==0){
            System.out.println(s);
            return ;
        }
        
        // binaryString(n-1, s+'0',0);
        // if(lastplace == 0){
        //    binaryString(n-1, s+'1',1);
        // }
        s.append(0);
        binaryString(n-1, s, 0);
        s.deleteCharAt(s.length()-1);
        if(lastplace == 0){
           s.append(1);
        binaryString(n-1, s, 1);
        s.deleteCharAt(s.length()-1);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        binaryString(n, new StringBuilder(""),0);
    }
}
