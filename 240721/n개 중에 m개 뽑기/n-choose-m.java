import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        generateCombinations(N, M, new ArrayList<>(), 1);
        
        scanner.close();
    }
    
    public static void generateCombinations(int N, int M, List<Integer> current, int start) {
        if (current.size() == M) {
            for (int num : current) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }
        
        for (int i = start; i <= N; i++) {
            current.add(i);
            generateCombinations(N, M, current, i + 1);
            current.remove(current.size() - 1);
        }
    }
}