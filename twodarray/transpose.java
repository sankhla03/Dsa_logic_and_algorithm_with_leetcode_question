package twodarray;

public class transpose {
    // public static int  number(int arr[][]){
    //     int n = arr.length;
    //     int m = arr[0].length;
    //     int count = 0;
    //     for(int i =0; i<n; i++){
    //         for(int j=0; j<m; j++){
    //             if(arr[i][j]==7){
    //                 count++;
    //             }
    //         }
    //     }
    // return count;
    // }

    // Print out the sum of the numbers in the second row of the “nums" array.
    // public static void sumsecond(int arr[][]){
    //         int n = arr[0].length;
    //         int sum = 0;
    //         for (int i =0; i<n; i++){
    //             sum += arr[1][i];               
    //         }
    //         System.out.println(sum);
    // }
//      Write a program to Find Transpose of Matrix
// What is Transpose? Transpose of a matrix is the process of swapping the rows to columns.
    public static void main(String[] args) {
//         int[][] arr = {
//                {1, 2},
//                {4, 5},
//                {7, 8}
// };
//     //    int result = number(arr);
// //    sumsecond(arr);
// transform(arr);
        int row = 2, column = 3;
        int[][] matrix = {{2, 3, 7}, {5, 6, 7}};
//Display original matrix
        printMatrix(matrix);
//Transpose the Matrix
        int[][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
//print the transposed matrix
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("The Matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
