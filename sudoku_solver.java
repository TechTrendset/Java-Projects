public class sudoku_solver {

    public static boolean isSafe(char[][] board, int row, int col, int number) {

        // row and column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;

            }

            if (board[col][i] == (char) (number + '0')) {
                return false;
            }

        }

        // grid
        int starting_row = (row / 3) * 3;
        int starting_column = (col / 3) * 3;

        for (int i = starting_row; i < starting_row + 3; i++) {
            for (int j = starting_column; j < starting_column + 3; j++) {

                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }

        return false;

    }

    public static boolean helper(char[][] board, int row, int col) {

        if (row == board.length) {  // base condition
            return true;
        }
        // aglay wali recursion pe naya row naya column
        int nrow = 0;
        int ncol = 0;

        if (col != board.length - 1) {
            nrow = 0;
            ncol = col + 1;
        } else {
            ncol = 0;
            nrow = row + 1;
        }

        if (board[row][col] != '.') {
            if (helper(board, nrow, ncol))
                 // agar number betha hai toh aglay cell ko call lagao
            { 
                return true;
            }
        } else {  // agar number nahi betha hova toh bethai gai
            for (int i = 0; i <= 9; i++) {
                if (isSafe(board, nrow, ncol, i)) {
                    board[row][col] = (char) (i + '0'); // agar safe hoga toh betha dai gai.
                    if (helper(board, nrow, ncol)) { // agay walai cells ke liye call
                        return true; // aglay walai cells agar true  return karai gai toh
                                     // hum bhi true return kar dai gai.
                    } else {
                        board[row][col] = '.'; // nahi kartai toh number ko hata dai gai
                    }
                }
            }
        }
        return false;

    }

    public static void sudokuSolver(char[][] board) {

        helper(board, 0, 0);

    }

   public static void main(String[] args) {
    
   }

}
