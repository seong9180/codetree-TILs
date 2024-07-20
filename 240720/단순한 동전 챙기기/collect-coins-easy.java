import java.io.*;
import java.util.*;

class Point {
    int x, y, coins, moves;
    
    Point(int x, int y, int coins, int moves) {
        this.x = x;
        this.y = y;
        this.coins = coins;
        this.moves = moves;
    }
}

public class Main {
    static int N;
    static char[][] grid;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Point start, end;
    static List<Point> coinList = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        grid = new char[N][N];
        
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                grid[i][j] = line.charAt(j);
                if (grid[i][j] == 'S') start = new Point(i, j, 0, 0);
                else if (grid[i][j] == 'E') end = new Point(i, j, 0, 0);
                else if (grid[i][j] >= '1' && grid[i][j] <= '9') {
                    coinList.add(new Point(i, j, 1 << (grid[i][j] - '1'), 0));
                }
            }
        }
        
        if (coinList.size() < 3) {
            System.out.println(-1);
            return;
        }
        
        Collections.sort(coinList, (a, b) -> Integer.bitCount(b.coins) - Integer.bitCount(a.coins));
        
        int result = bfs();
        System.out.println(result);
    }
    
    static int bfs() {
        Queue<Point> queue = new LinkedList<>();
        boolean[][][] visited = new boolean[N][N][1 << coinList.size()];
        queue.offer(start);
        visited[start.x][start.y][0] = true;
        
        while (!queue.isEmpty()) {
            Point current = queue.poll();
            
            if (current.x == end.x && current.y == end.y && Integer.bitCount(current.coins) >= 3) {
                return current.moves;
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                
                if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
                
                int newCoins = current.coins;
                if (grid[nx][ny] >= '1' && grid[nx][ny] <= '9') {
                    int coinIndex = grid[nx][ny] - '1';
                    if ((newCoins & (1 << coinIndex)) == 0 && 
                        (newCoins == 0 || coinIndex > Integer.numberOfTrailingZeros(newCoins))) {
                        newCoins |= (1 << coinIndex);
                    }
                }
                
                if (!visited[nx][ny][newCoins]) {
                    visited[nx][ny][newCoins] = true;
                    queue.offer(new Point(nx, ny, newCoins, current.moves + 1));
                }
            }
        }
        
        return -1;
    }
}