package Leetcode_question;

public class towerOfHanoi {
    public static void hanoi(int n, String start,String helper, String end){
        if(n==1){
            System.out.println("Transfer disk "+ n + " from "+ start + " to " + end);
            return;
        }
        hanoi(n-1,start,end,helper);
        System.out.println("Transfer disk "+ n + " from "+ start + " to " + end);
        hanoi(n-1,helper,start,end);
    }
    public static void main(String[] args) {
        int n = 3;
        hanoi(n,"S","H","D");
    }
}
