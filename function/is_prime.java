package function;

import java.util.Scanner;

public class is_prime {
    // public static boolean isprime(int n){
    //     boolean isPrime = true;
    //     for (int i = 2; i<n-1; i++){
    //         if(n%i == 0){
    //             isPrime = false;
    //             break;
                
    //         }
    //     }
    //     return isPrime;
    // }
    //=------------------------optimized code:=--------------------------------------------------------
       
        public static boolean isprime(int n){
        if(n == 2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;          
            }
        }
        return true;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isprime(num)){
            System.out.println(num + " is a prime number.");
        }
        else{
            System.out.println(num + " is not a prime number.");
        }

    }
}
