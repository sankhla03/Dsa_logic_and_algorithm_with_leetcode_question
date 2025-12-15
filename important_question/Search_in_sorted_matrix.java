package important_question;

public class Search_in_sorted_matrix {
    public static boolean search_matrix(int metrics[][], int target){
        int n = metrics.length;
        int m = metrics[0].length;
        int row =0; 
        int col = m-1;
        while(row < n && col >= 0){
            if(metrics[row][col] == target){
                System.out.println("value found at (" +row+ ","+col+")");
                return true;
            }
            else if(metrics[row][col] > target){
                col--;
            }
            else if(metrics[row][col] < target){
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
         int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        boolean ans = search_matrix(arr,8);
        System.out.println(ans);
    }
}
