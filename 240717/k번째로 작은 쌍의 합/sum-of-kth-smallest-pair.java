import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int[] A = new int[n];
        int[] B = new int[m];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.offer(new Pair(0, 0, A[0] + B[0]));
        
        Set<String> visited = new HashSet<>();
        visited.add("0,0");
        
        int result = 0;
        while (k > 0 && !pq.isEmpty()) {
            Pair current = pq.poll();
            k--;
            
            if (k == 0) {
                result = current.sum;
                break;
            }
            
            if (current.i + 1 < n) {
                String key = (current.i + 1) + "," + current.j;
                if (!visited.contains(key)) {
                    pq.offer(new Pair(current.i + 1, current.j, A[current.i + 1] + B[current.j]));
                    visited.add(key);
                }
            }
            
            if (current.j + 1 < m) {
                String key = current.i + "," + (current.j + 1);
                if (!visited.contains(key)) {
                    pq.offer(new Pair(current.i, current.j + 1, A[current.i] + B[current.j + 1]));
                    visited.add(key);
                }
            }
        }
        
        System.out.println(result);
    }
    
    static class Pair implements Comparable<Pair> {
        int i, j, sum;
        
        Pair(int i, int j, int sum) {
            this.i = i;
            this.j = j;
            this.sum = sum;
        }
        
        @Override
        public int compareTo(Pair other) {
            return this.sum - other.sum;
        }
    }
}