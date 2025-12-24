package Bit_manipulation;

public class powerofTwo {
    public static boolean ispoweroftwo(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        int n = 16;
        if(ispoweroftwo(n)){
            System.out.println("power of two");
        }
        else{
            System.out.println("not a power of two");
        }
    }
}
