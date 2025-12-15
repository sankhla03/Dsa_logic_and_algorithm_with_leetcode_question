package function;

public class swapFunction {
    public static void swap(int a, int b){
        int temp = a; 
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public static void main(String arg[]){
        int a = 5;
        int b = 10;

        System.out.println("Before swap: a = " + a + ", b = " + b);
        swap(a, b);
       
    }
}
