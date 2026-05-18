package Leetcode_question;

public class GCDofTwoNumbers {
    public static int gcd(int a, int b){
    //     if(b==0){
    //         return a;
    //     }
    //     return gcd(b, a % b);

    for(int i = Math.min(a,b); i>=1; i--){
        if(a%i ==0 && b%i ==0){
            return i;
        }

    }
    return 1;
    }
        public static void main(String[] args) {
        int a=48;
        int b=18;
        int result=gcd(a,b);
        System.out.println("The GCD of "+a+" and "+b+" is: "+result);
        }
    }

