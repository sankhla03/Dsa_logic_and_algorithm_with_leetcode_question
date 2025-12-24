package Bit_manipulation;

public class countSetBits {
    public static int countBit(int n){
        int count =0;
        while(n >0){
            if((n&1) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 13;
        System.out.println("The number of set bits in " + n + " is: " + countBit(n));
    }
}
