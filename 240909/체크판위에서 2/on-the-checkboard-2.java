import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        String[][] grid = new String[R][C];
        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < C; j++) {
                grid[i][j] = st.nextToken();
            }
        }
        
        int cnt = 0;
        for (int i = 1; i < R - 1; i++) {
            for (int j = 1; j < C - 1; j++) {
                for (int k = i + 1; k < R - 1; k++) {
                    for (int l = j + 1; l < C - 1; l++) {
                        if (!grid[0][0].equals(grid[i][j]) &&
                            !grid[i][j].equals(grid[k][l]) &&
                            !grid[k][l].equals(grid[R-1][C-1])) {
                            cnt++;
                        }
                    }
                }
            }
        }
        
        System.out.println(cnt);
    }
}