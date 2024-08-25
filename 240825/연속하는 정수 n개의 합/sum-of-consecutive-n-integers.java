import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int count = 0;
        int sum = 0;
        int start = 0;
        
        for (int end = 0; end < n; end++) {
            sum += arr[end];
            
            while (sum > m && start <= end) {
                sum -= arr[start];
                start++;
            }
            
            if (sum == m) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}