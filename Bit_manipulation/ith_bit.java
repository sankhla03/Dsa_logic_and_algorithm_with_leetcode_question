package Bit_manipulation;

public class ith_bit {
    public static int gitith_bit(int n, int i){
        int bitmax = 1<<i;
        if((n & bitmax) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int clearith_bit(int n, int i){
        int bitmax = ~(1<<i);
        return n &bitmax;
    }
     public static int updateith_bit(int n, int i, int newbit){
        n = clearith_bit(n, i);
       
         int newbitmax = newbit << i;
         return n | newbitmax;
       
    }
    public static int rangeclear(int n, int i, int j){
        int a = (~0)<< (j+1);
        int b = (1<<i)-1;
        int bitmax = a|b;
        return n & bitmax;
    }

    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        System.out.println(rangeclear(n, i, 4));
    }
}
