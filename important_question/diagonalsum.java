package important_question;

public class diagonalsum {
    public static int sum(int arr[][]){
        int n = arr.length;
        int sum = 0;
        for (int i =0;i<n;i++){
            // for(int j=0; j<n; j++){
            //     if(i==j){
            //         sum += arr[i][j];
            //     }
            //     else if(i+j == n-1){
            //         sum += arr[i][j];
            //     }
            // }
            // optimizing the above code
            sum += arr[i][i]; // primary diagonal
            if(i != n-1-1){
                sum+= arr[i][n-i-1]; // secondary diagonal
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("The sum of diagonals is: " + sum(arr));
    }
}
