import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        boolean[] used = new boolean[n];
        int[] sequence = new int[n];

        generatePermutations(n, 0, sequence, used);
    }

    private static void generatePermutations(int n, int index, int[] sequence, boolean[] used) {
        if (index == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(sequence[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                used[i] = true;
                sequence[index] = i + 1;
                generatePermutations(n, index + 1, sequence, used);
                used[i] = false;
            }
        }
    }
}