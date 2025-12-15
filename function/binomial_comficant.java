package function;

import java.util.Scanner;

public class binomial_comficant {
    public static int fact(int n){
        if(n ==0 || n ==1){
            return 1 ;

        }
        else{
            return n*fact(n-1);
        }
    }
    public static int  binomia(int n, int r){
        int bin = fact(n)/(fact(r)*fact(n-r));
        return bin;
    }
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int result = binomia(n,r);
        System.out.println("Binomial Coefficient " + result);
    }
}
