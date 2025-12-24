package Leetcode_question;

public class bit_opration {
    // public static void swap(int a, int b){
    //     a = a^b;
    //     b = a^b;
    //     a = a^b;
    //     System.out.println("After swapping a: " + a + " b: " + b);
    // }
    // public static void add(int a){
    //     System.out.println(a + " + " + 1 + "is "+ -(~a));
    // }
    

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        // System.out.println("Before swapping a: " + a + " b: " + b);
        // swap(a, b);
        // add(a);
        for( char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print((char)(ch | ' '));
        }
        System.out.println();

    }
}
