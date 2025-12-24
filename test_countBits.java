public class test_countBits {
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
        int[] testCases = {0, 1, 5, 7, 13, 15, 31};
        for(int n : testCases){
            System.out.println("The number of set bits in " + n + " is: " + countBit(n));
        }
    }
}
