import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] prefixSum = new int[N + 1];
        Map<Integer, Integer> modMap = new HashMap<>();
        modMap.put(0, 0);
        
        int maxLength = 0;
        
        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(br.readLine());
            prefixSum[i] = (prefixSum[i-1] + num) % 7;
            
            if (modMap.containsKey(prefixSum[i])) {
                maxLength = Math.max(maxLength, i - modMap.get(prefixSum[i]));
            } else {
                modMap.put(prefixSum[i], i);
            }
        }
        
        System.out.println(maxLength);
    }
}