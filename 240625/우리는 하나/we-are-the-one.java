import java.util.*;

public class Main {
    static int n, k, u, d;
    static int[][] grid;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int maxCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        k = sc.nextInt();
        u = sc.nextInt();
        d = sc.nextInt();
        
        grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        List<int[]> cities = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cities.add(new int[]{i, j});
            }
        }
        
        List<int[]> combinations = new ArrayList<>();
        generateCombinations(cities, new int[k], 0, 0, combinations);
        
        for (int[] combination : combinations) {
            Set<String> reachable = new HashSet<>();
            for (int city : combination) {
                int x = city / n;
                int y = city % n;
                bfs(x, y, reachable);
            }
            maxCount = Math.max(maxCount, reachable.size());
        }
        
        System.out.println(maxCount);
    }

    private static void generateCombinations(List<int[]> cities, int[] current, int index, int start, List<int[]> combinations) {
        if (index == current.length) {
            combinations.add(current.clone());
            return;
        }
        for (int i = start; i < cities.size(); i++) {
            current[index] = cities.get(i)[0] * n + cities.get(i)[1];
            generateCombinations(cities, current, index + 1, i + 1, combinations);
        }
    }

    private static void bfs(int startX, int startY, Set<String> reachable) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;
        reachable.add(startX + "," + startY);
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny]) {
                    int heightDiff = Math.abs(grid[nx][ny] - grid[x][y]);
                    if (heightDiff >= u && heightDiff <= d) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                        reachable.add(nx + "," + ny);
                    }
                }
            }
        }
    }
}