import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int[][][] sum = new int[n+1][m+1][3]; // 누적 합을 저장할 3차원 배열
        
        // 입력 받고 누적 합 계산
        for (int i = 1; i <= n; i++) {
            String line = br.readLine();
            for (int j = 1; j <= m; j++) {
                char c = line.charAt(j-1);
                int index = c - 'a';
                
                for (int l = 0; l < 3; l++) {
                    sum[i][j][l] = sum[i-1][j][l] + sum[i][j-1][l] - sum[i-1][j-1][l];
                }
                sum[i][j][index]++;
            }
        }
        
        // 질의 처리
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int r1 = Integer.parseInt(st.nextToken());
            int c1 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());
            
            for (int j = 0; j < 3; j++) {
                int count = sum[r2][c2][j] - sum[r1-1][c2][j] - sum[r2][c1-1][j] + sum[r1-1][c1-1][j];
                sb.append(count).append(" ");
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
}