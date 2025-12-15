package twodarray;

import java.util.Scanner;

public class largest {
    public static int maximum(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                if(arr[i][j] >largest){
                    largest = arr[i][j];
                }
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<3; i++){
            for(int j =0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = maximum(arr);
        System.out.println("The largest element in the array is: " + ans);
    }
}
