import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        
        long totalSum = 0;
        for (int i = 0; i < N; i++) {
            totalSum += numbers[i];
        }
        
        long prefixSum = 0;
        double maxAverage = 0;
        
        for (int K = 1; K <= N - 2; K++) {
            prefixSum += numbers[K - 1];
            long remainingSum = totalSum - prefixSum;
            
            int minRemaining = Integer.MAX_VALUE;
            for (int i = K; i < N; i++) {
                minRemaining = Math.min(minRemaining, numbers[i]);
            }
            
            remainingSum -= minRemaining;
            int remainingCount = N - K - 1;
            
            double average = (double) remainingSum / remainingCount;
            maxAverage = Math.max(maxAverage, average);
        }
        
        System.out.printf("%.2f\n", maxAverage);
    }
}