import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[2 * n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < 2 * n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(numbers);
        
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minDifference = Math.min(minDifference, numbers[n + i] - numbers[i]);
        }
        
        System.out.println(minDifference);
    }
}