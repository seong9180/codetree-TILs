import java.util.*;

public class Main {
    static int n;
    static int[] numbers;
    static int minDifference = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        numbers = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            numbers[i] = scanner.nextInt();
        }

        backtrack(0, 0, 0, 0);

        System.out.println(minDifference);
    }

    static void backtrack(int index, int count, int sum1, int sum2) {
        if (index == 2 * n) {
            if (count == n) {
                minDifference = Math.min(minDifference, Math.abs(sum1 - sum2));
            }
            return;
        }

        if (count < n) {
            backtrack(index + 1, count + 1, sum1 + numbers[index], sum2);
        }

        backtrack(index + 1, count, sum1, sum2 + numbers[index]);
    }
}