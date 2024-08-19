import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 첫 번째 줄에서 원소의 개수 n을 읽어들인다.
        int n = scanner.nextInt();
        // 두 번째 줄에서 n개의 정수를 읽어들인다.
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Kadane의 알고리즘을 사용하여 최대 연속 부분 배열 합을 계산한다.
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        
        for (int i = 1; i < n; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        // 결과를 출력한다.
        System.out.println(maxSoFar);
        
        // Scanner를 닫는다.
        scanner.close();
    }
}