import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int n = scanner.nextInt();
        int[] arr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        // 배열 정렬
        Arrays.sort(arr);

        // 각 그룹 내의 두 수의 차이 중 최솟값을 최대화
        int maxMinDifference = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int difference = arr[2 * i + 1] - arr[2 * i];
            maxMinDifference = Math.max(maxMinDifference, difference);
        }

        // 결과 출력
        System.out.println(maxMinDifference);
    }
}