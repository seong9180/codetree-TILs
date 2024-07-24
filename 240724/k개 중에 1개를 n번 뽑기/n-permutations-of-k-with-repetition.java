import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int N = scanner.nextInt();
        
        int[] arr = new int[N];
        generateCombinations(K, N, 0, arr);
    }

    // 재귀적으로 모든 조합을 생성하는 함수
    public static void generateCombinations(int K, int N, int index, int[] arr) {
        // N개의 숫자를 모두 선택한 경우
        if (index == N) {
            printArray(arr);
            return;
        }
        
        // 1부터 K까지의 숫자를 선택하여 배열에 저장하고 재귀 호출
        for (int i = 1; i <= K; i++) {
            arr[index] = i;
            generateCombinations(K, N, index + 1, arr);
        }
    }

    // 배열의 내용을 출력하는 함수
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}