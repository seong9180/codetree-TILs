import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // K와 N을 입력 받음
        int K = scanner.nextInt();
        int N = scanner.nextInt();

        // 결과를 담을 배열
        int[] result = new int[N];

        // 순열 생성 및 출력
        generatePermutations(result, K, N, 0);
    }

    // 순열을 생성하는 재귀 함수
    public static void generatePermutations(int[] result, int K, int N, int depth) {
        if (depth == N) {
            // 결과 출력
            for (int i = 0; i < N; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        // 1부터 K까지의 숫자를 사용하여 순열 생성
        for (int i = 1; i <= K; i++) {
            result[depth] = i;
            generatePermutations(result, K, N, depth + 1);
        }
    }
}