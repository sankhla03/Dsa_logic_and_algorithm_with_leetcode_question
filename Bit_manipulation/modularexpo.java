package Bit_manipulation;

public class modularexpo {
    public static int modular(int x, int n, int m){
        x= x % m ; //We do  x= x % m to reduce the base using modular arithmetic, which prevents overflow, keeps values small, improves performance, and does not affect the final result.
        int result = 1;
        while(n >0){
            if((n & 1) == 1){
                result = (result*x)%m;
            }
            x =( x*x)%m;
            n = n>>1;
        }
        return result ;
    }
    public static void main(String[] args) {
        int x = 3;
        int n = 13;
        int m = 7;
        System.out.println(modular(x, n, m));
    }
}
