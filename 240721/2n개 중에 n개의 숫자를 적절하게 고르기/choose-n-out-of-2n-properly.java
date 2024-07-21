import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] numbers = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println(minDifference(n, numbers));
        
        scanner.close();
    }
    
    public static int minDifference(int n, int[] numbers) {
        int total = Arrays.stream(numbers).sum();
        int[] currentCombination = new int[n];
        return generateCombinations(numbers, currentCombination, 0, 0, n, total, Integer.MAX_VALUE);
    }
    
    private static int generateCombinations(int[] numbers, int[] currentCombination, int start, int currentLength, int n, int total, int minDiff) {
        if (currentLength == n) {
            int sumCombo = Arrays.stream(currentCombination).sum();
            return Math.min(minDiff, Math.abs(total - 2 * sumCombo));
        }
        
        for (int i = start; i < numbers.length; i++) {
            currentCombination[currentLength] = numbers[i];
            minDiff = generateCombinations(numbers, currentCombination, i + 1, currentLength + 1, n, total, minDiff);
        }
        
        return minDiff;
    }
}