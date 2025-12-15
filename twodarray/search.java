package twodarray;

import java.util.Scanner;


public class search {
    public static boolean search2d(int arr[][], int key){
        int n= arr.length;
        int m = arr[0].length;
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == key){
                    System.out.println("key found at  (" +i+ ","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int n= arr.length;
        int m = arr[0].length;
        Scanner sc =  new Scanner(System.in);
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println(search2d(arr, 5));    
    }
}