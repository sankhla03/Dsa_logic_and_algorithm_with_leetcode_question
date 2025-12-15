package Arrays;

import java.util.Scanner;

public class outputInput {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        // arr[0] = sc.nextInt();
        // arr[1] = sc.nextInt();
        // System.out.println(arr[0]);
        System.out.println("Enter the elements of the array: ");
        for (int i = 0;i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0;i<arr.length; i++){
            System.out.println("elelment at index " +i+ " is " + arr[i]);
        }
    }
}
