import java.util.Scanner;

public class Main {
    static int n;
    static int[][] grid;
    static boolean[] visited;
    static int maxMinValue;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        grid = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        visited = new boolean[n];
        maxMinValue = Integer.MIN_VALUE;
        
        dfs(0, Integer.MAX_VALUE);
        
        System.out.println(maxMinValue);
    }
    
    static void dfs(int row, int currentMin) {
        if (row == n) {
            maxMinValue = Math.max(maxMinValue, currentMin);
            return;
        }
        
        for (int col = 0; col < n; col++) {
            if (!visited[col]) {
                visited[col] = true;
                dfs(row + 1, Math.min(currentMin, grid[row][col]));
                visited[col] = false;
            }
        }
    }
}