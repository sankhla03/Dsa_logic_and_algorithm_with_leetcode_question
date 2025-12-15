package function;

public class decTobin {
    public static int dectobin(int dec){
        int bin = 0;
        int p = 0;
        while(dec >0){
            int rem = dec %2;
            bin = bin + rem *(int)(Math.pow(10,p));
            p++;
            dec = dec/2;

        }
        return bin;
    }
    public static void main(String[] args) {
        int dec = 5;
        System.out.println("Binary of " + dec + " is: " + dectobin(dec));
    }
}
