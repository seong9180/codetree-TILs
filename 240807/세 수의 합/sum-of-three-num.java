import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int n = scanner.nextInt(); // 원소의 개수
        int k = scanner.nextInt(); // 목표 합
        
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // 조합의 개수 계산
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int l = j + 1; l < n; l++) {
                    if (numbers[i] + numbers[j] + numbers[l] == k) {
                        count++;
                    }
                }
            }
        }
        
        // 결과 출력
        System.out.println(count);
        
        scanner.close();
    }
}