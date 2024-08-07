import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int n = scanner.nextInt(); // 원소의 개수
        int m = scanner.nextInt(); // 질의의 수
        
        // HashMap을 사용하여 각 숫자의 등장 횟수 저장
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        // n개의 원소 입력 받고 등장 횟수 계산
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // m개의 질의에 대한 결과 출력
        for (int i = 0; i < m; i++) {
            int query = scanner.nextInt();
            System.out.print(countMap.getOrDefault(query, 0) + " ");
        }
        
        scanner.close();
    }
}