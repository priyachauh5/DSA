public class Rat_In_A_Maze {
    public static int Rat(int x, int y, int n, int m, int[][] maze) {
        // Base case: If the rat reaches the bottom-right corner
        if (x == n - 1 && y == m - 1) {
            return 1; // Found a path
        }
        // Check if the current position is out of bounds or blocked
        if (x < 0 || y < 0 || x >= n || y >= m || maze[x][y] == 0) {
            return 0; // No path if out of bounds or blocked
        }

        // Mark the current cell as visited by setting it to 0
        maze[x][y] = 0;

        // Move in all possible directions: up, down, right, left
        int w1 = Rat(x, y - 1, n, m, maze); // Up
        int w2 = Rat(x, y + 1, n, m, maze); // Down
        int w3 = Rat(x + 1, y, n, m, maze); // Right
        int w4 = Rat(x - 1, y, n, m, maze); // Left

        // Mark the cell back as unvisited (restore the maze for other paths)
        maze[x][y] = 1;

        return w1 + w2 + w3 + w4; // Return the total number of paths found
    }

    public static void main(String[] args) {
        int maze[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {0, 1, 0, 0}, {1, 1, 1, 1}};
        int n = 4;
        int m = 4;
        System.out.println(Rat(0, 0, n, m, maze)); // Start from (0, 0)
    }
}
