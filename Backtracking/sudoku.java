// public class sudoku{
//     public static boolean isSafe(int sudoku[][], int row, int col, int digit){
//         //column
//         for(int i=0; i<=8; i++){
//             if(sudoku[i][col]==digit){
//                 return false;
//             }
//         }
//         //row
//         for(int j=0; j<=8; j++){
//             if(sudoku[row][j]==digit){
//                 return false;
//             }
//         }
//         //grid
//         int sr=(row/3)*3;
//         int sc=(col/3)*3;
//         // 3x3 gitd
//         for(int i=sr; i<sr+3; i++){ //rowwise
//             for(int j=sc; j<sc+3; j++){ //colwise
//                 if(sudoku[i][j]==digit){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }

//     public static boolean sudokuSolver(int sudoku[][], int row, int col){
//         //base case
//         if(row==9){
//             return true;
//         }

//         //recursion
//         int nextRow=row, nextCol=col+1;
//         if(col+1==9){
//             nextRow=row+1;
//             nextCol=0;
//         }
//         //jab 0 likha hai tabhi hi place karskte hai elements ko
//         if(sudoku[row][col]!=0){
//             return sudokuSolver(sudoku, nextRow, nextCol);
//         }

//         for(int digit=1; digit<=9; digit++){
//             if(isSafe(sudoku, row, col, digit)){
//                 sudoku[row][col]=digit;
//                 if(sudokuSolver(sudoku, nextRow, nextCol)){ //solution exists
//                     return true;
//                 }
//                 sudoku[row][col]=0;
//             }
//         }
//         return false;
//     }

//     public static void printSudoku(int sudoku[][]){
//         for(int i=0; i<9; i++){
//             for(int j=0; j<9; j++){
//                 System.out.print(sudoku[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]){
//         int sudoku[][]={{0,0,8,0,0,0,0,0,0},
//                         {4,9,0,0,1,5,7,0,2},
//                         {0,0,3,0,0,4,1,9,0},
//                         {1,8,5,0,6,0,0,2,0},
//                         {0,0,0,0,2,0,0,6,0},
//                         {9,6,0,4,0,5,3,0,0},
//                         {0,3,0,0,7,2,0,0,4},
//                         {0,4,9,0,3,0,0,5,7},
//                         {8,2,7,0,0,9,0,1,3},};

//         if(sudokuSolver(sudoku,0,0)){
//             System.out.println("solution exists");
//             printSudoku(sudoku);
//         }else{
//             System.out.println("solution does not exist");
//         }
//     }
// }

public class Sudoku {
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // Check column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // Check row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // Check 3x3 grid
        int sr = (row / 3) * 3; // Starting row of the sub-grid
        int sc = (col / 3) * 3; // Starting column of the sub-grid
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        // Base case: if we reach row 9, the Sudoku is solved
        if (row == 9) {
            return true;
        }

        // Calculate the next cell
        int nextRow = row, nextCol = col + 1;
        if (col == 8) { // Move to the next row if column is 8
            nextRow = row + 1;
            nextCol = 0;
        }

        // If the cell is already filled, move to the next cell
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        // Try placing digits 1 to 9 in the current cell
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit; // Place the digit
                if (sudokuSolver(sudoku, nextRow, nextCol)) { // Solve the rest
                    return true;
                }
                sudoku[row][col] = 0; // Backtrack
            }
        }

        return false; // No solution found
    }

    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int sudoku[][] = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9},
        };

        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution exists:");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution does not exist");
        }
    }
}


