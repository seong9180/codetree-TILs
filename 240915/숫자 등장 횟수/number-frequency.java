import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받기
        int n = scanner.nextInt();  // 수열의 크기
        int m = scanner.nextInt();  // 질의의 수
        
        // 수열에서 숫자 등장 횟수를 저장할 맵
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        // 수열 입력받기
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // 질의 처리
        for (int i = 0; i < m; i++) {
            int query = scanner.nextInt();
            // 해당 숫자의 등장 횟수 출력 (없으면 0 출력)
            System.out.print(countMap.getOrDefault(query, 0) + " ");
        }
        
        // 개행
        System.out.println();
        
        scanner.close();
    }
}