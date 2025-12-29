package recursion;

public class power {
    // public static int power(int x, int n){
    //     if(n == 1){
    //         return x;
    //     }
    //     return x*power(x,n-1);
        
    // }
    public static int powerOptimizer(int x, int n){
        if(n==0){
            return 1;
        }
        int half = powerOptimizer(x, n/2);
        int powerSq = half*half;
        if(n % 2 !=0){
            powerSq = x*powerSq;
        }
        return powerSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(powerOptimizer(x,n));
    }
}
