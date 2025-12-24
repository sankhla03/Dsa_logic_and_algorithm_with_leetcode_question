package Leetcode_question;

public class search_matrix {
    public static boolean searchMatrix(int arr[][], int target){
        int n = arr.length;
        int row = 0;
        int col = n-1;
        while(row<=n && col >=0){
            if(arr[row][col] == target){
                System.out.println("("+row+","+col+")");
                return true;
            }
            else if(arr[row][col] > target){
                  col--;
            }
            else if(arr[row][col] < target){
                  row++;
            }


        }
       return false;
    }
    public static void main(String[] args) {
       int arr[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
       System.out.println(searchMatrix(arr,12));
    }
}
