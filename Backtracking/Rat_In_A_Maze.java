public class Rat_In_A_Maze {
    public static int Rat(int x, int y, int n, int m, int[][] maze, boolean[][] visited) {
        // Base case: If the rat reaches the bottom-right corner
        if (x == n - 1 && y == m - 1) {
            return 1; // Found a path
        }

        // Check if the current position is out of bounds, blocked, or already visited
        if (x < 0 || y < 0 || x >= n || y >= m || maze[x][y] == 0 || visited[x][y]) {
            return 0; // No path if out of bounds, blocked, or visited
        }

        // Mark the current cell as visited
        visited[x][y] = true;

        // Move in all possible directions: up, down, right, left
        int w1 = Rat(x, y - 1, n, m, maze, visited); // Up
        int w2 = Rat(x, y + 1, n, m, maze, visited); // Down
        int w3 = Rat(x + 1, y, n, m, maze, visited); // Right
        int w4 = Rat(x - 1, y, n, m, maze, visited); // Left

        // Backtrack: Unmark the current cell as visited (restore the state)
        visited[x][y] = false;

        return w1 + w2 + w3 + w4; // Return the total number of paths found
    }

    public static void main(String[] args) {
        int maze[][] = {{1, 0, 0, 0}, 
                        {1, 1, 0, 1}, 
                        {0, 1, 0, 0}, 
                        {1, 1, 1, 1}};
        int n = 4; // Number of rows
        int m = 4; // Number of columns
        boolean[][] visited = new boolean[n][m]; // Create a visited array
        System.out.println(Rat(0, 0, n, m, maze, visited)); // Start from (0, 0)
    }
}
