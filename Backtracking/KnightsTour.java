public class KnightsTour {
    
    static int N = 8;
    static int[][] board = new int[N][N];
    
    // All possible moves of a knight (8 possibilities)
    static int[] moveX = { 2, 1, -1, -2, -2, -1, 1, 2 };
    static int[] moveY = { 1, 2, 2, 1, -1, -2, -2, -1 };

    // Check if the current position is valid (inside the board and not visited yet)
    public static boolean isSafe(int x, int y) {
        if (x >= 0 && y >= 0 && x < N && y < N && board[x][y] == -1) {
            return true;
        }
        return false;
    }

    // Backtracking function to solve the Knight's Tour problem
    public static boolean solveKnightTour(int currX, int currY, int moveCount) {
        if (moveCount == N * N) {
            return true;
        }

        // Try all next moves from the current position
        for (int i = 0; i < 8; i++) {
            int newX = currX + moveX[i];
            int newY = currY + moveY[i];

            if (isSafe(newX, newY)) {
                board[newX][newY] = moveCount;
                if (solveKnightTour(newX, newY, moveCount + 1)) {
                    return true;
                }
                board[newX][newY] = -1; // Backtracking
            }
        }

        return false;
    }

    // Function to print the board
    public static void printBoard() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Initialize the board
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = -1; // -1 means the square has not been visited
            }
        }

        // Starting position of the knight
        int startX = 0;
        int startY = 0;
        board[startX][startY] = 0; // Start the knight from the first block

        // Solve the Knight's Tour problem
        if (solveKnightTour(startX, startY, 1)) {
            printBoard();
        } else {
            System.out.println("Solution does not exist");
        }
    }
}
