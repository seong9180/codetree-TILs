import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];
        int[] D = new int[n];
        
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.nextLine(); // consume newline
        
        for (int i = 0; i < n; i++) {
            B[i] = scanner.nextInt();
        }
        scanner.nextLine(); // consume newline
        
        for (int i = 0; i < n; i++) {
            C[i] = scanner.nextInt();
        }
        scanner.nextLine(); // consume newline
        
        for (int i = 0; i < n; i++) {
            D[i] = scanner.nextInt();
        }
        
        // HashMap to store sums and their counts
        Map<Integer, Integer> sumCountAB = new HashMap<>();
        Map<Integer, Integer> sumCountCD = new HashMap<>();
        
        // Calculate all possible sums of A + B
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = A[i] + B[j];
                sumCountAB.put(sum, sumCountAB.getOrDefault(sum, 0) + 1);
            }
        }
        
        // Calculate all possible sums of C + D
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = C[i] + D[j];
                sumCountCD.put(sum, sumCountCD.getOrDefault(sum, 0) + 1);
            }
        }
        
        int count = 0;
        
        // Count pairs (A+B, -(C+D)) that sum to 0
        for (int sumAB : sumCountAB.keySet()) {
            int target = -sumAB;
            if (sumCountCD.containsKey(target)) {
                count += sumCountAB.get(sumAB) * sumCountCD.get(target);
            }
        }
        
        System.out.println(count);
        
        scanner.close();
    }
}