import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        int[] redStones = new int[C];
        for (int i = 0; i < C; i++) {
            redStones[i] = Integer.parseInt(br.readLine());
        }
        
        int[][] blackStones = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            blackStones[i][0] = Integer.parseInt(st.nextToken());
            blackStones[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(redStones);
        Arrays.sort(blackStones, (a, b) -> Integer.compare(a[1], b[1]));
        
        int count = 0;
        int blackIndex = 0;
        
        for (int redT : redStones) {
            while (blackIndex < N && blackStones[blackIndex][1] < redT) {
                blackIndex++;
            }
            if (blackIndex < N && blackStones[blackIndex][0] <= redT && redT <= blackStones[blackIndex][1]) {
                count++;
                blackIndex++;
            }
        }
        
        System.out.println(count);
    }
}