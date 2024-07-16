import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];
        int[] D = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            C[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            D[i] = Integer.parseInt(st.nextToken());
        }
        
        Map<Integer, Integer> sumAB = new HashMap<>();
        
        for (int a : A) {
            for (int b : B) {
                int sum = a + b;
                sumAB.put(sum, sumAB.getOrDefault(sum, 0) + 1);
            }
        }
        
        long count = 0;
        
        for (int c : C) {
            for (int d : D) {
                int sum = -(c + d);
                count += sumAB.getOrDefault(sum, 0);
            }
        }
        
        System.out.println(count);
    }
}