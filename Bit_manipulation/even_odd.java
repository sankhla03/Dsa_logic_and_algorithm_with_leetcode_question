package Bit_manipulation;

public class even_odd {
    public static boolean iseven(int n){
        if((n&1) == 0 ){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 4;
        if(iseven(n) == true){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
       
    }
}
