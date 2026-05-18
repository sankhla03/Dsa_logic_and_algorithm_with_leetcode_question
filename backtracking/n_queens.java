package backtracking;


public class n_queens {

    public static boolean isSafe(char[][] board, int row,int col){
        // check vertically 
        for(int i =row-1; i>= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // check diagonal right...
        for(int i = row-1, j = col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row-1, j =col+1 ; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
       return true;
    }
    public static void n_queen(char[][] board, int row){
        
        if(row == board.length ){
            print(board);
            return;
           }

        for(int i =0; i<board.length; i++){ 
        if(isSafe(board,row,i)){
             board[row][i] = 'Q';
             n_queen(board, row+1);
             board[row][i] = 'x';
        }
        }

     }
    public static void print(char[][] board){
        System.err.println("................chase board.........................");
        for(int i =0; i<board.length; i++){
            for(int j =0; j<board.length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n =4;
        char[][] board = new char[n][n];

        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                board[i][j] = 'X';
            }
        }
        n_queen(board, 0);
    }
    
}
