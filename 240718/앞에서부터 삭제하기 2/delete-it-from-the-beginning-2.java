import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        long totalSum = 0;
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
            totalSum += numbers[i];
        }
        
        long[] prefixSum = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + numbers[i - 1];
        }
        
        int[] minFromRight = new int[N + 1];
        minFromRight[N] = Integer.MAX_VALUE;
        for (int i = N - 1; i >= 0; i--) {
            minFromRight[i] = Math.min(minFromRight[i + 1], numbers[i]);
        }
        
        double maxAverage = 0;
        for (int K = 1; K <= N - 2; K++) {
            long sum = totalSum - prefixSum[K] - minFromRight[K];
            int count = N - K - 1;
            double average = (double) sum / count;
            maxAverage = Math.max(maxAverage, average);
        }
        
        System.out.printf("%.2f\n", maxAverage);
    }
}