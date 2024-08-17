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
        
        Arrays.sort(redStones);
        
        TreeSet<Integer> availableReds = new TreeSet<>();
        for (int i = 0; i < C; i++) {
            availableReds.add(i);
        }
        
        int[][] blackStones = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            blackStones[i][0] = Integer.parseInt(st.nextToken());
            blackStones[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(blackStones, (a, b) -> a[1] - b[1]);
        
        int count = 0;
        for (int[] black : blackStones) {
            Integer redIndex = availableReds.ceiling(
                lowerBound(redStones, black[0])
            );
            if (redIndex != null && redIndex < C && redStones[redIndex] <= black[1]) {
                count++;
                availableReds.remove(redIndex);
            }
        }
        
        System.out.println(count);
    }
    
    private static int lowerBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}