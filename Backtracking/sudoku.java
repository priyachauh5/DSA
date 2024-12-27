public class sudoku{
    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        //column
        for(int i=0, i<=8; i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //row
        for(in tj=0; j<=8; j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        //base case
        if(row==9 && col==9){
            return true;
        }else if(row==9){
            return false;
        }

        //recursion
        int nextRow=row, nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        //jab 0 likha hai tabhi hi place karskte hai elements ko
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for(int digit=1, digit<=9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){ //solution exists
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
                        {4,9,0,0,1,5,7,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3},}
    }
}