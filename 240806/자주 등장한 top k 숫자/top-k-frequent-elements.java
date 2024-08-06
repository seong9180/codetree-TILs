import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // 숫자 등장 횟수 카운트
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // 등장 횟수와 숫자 값을 기준으로 정렬
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(b[1], a[1]); // 등장 횟수 내림차순
            }
            return Integer.compare(b[0], a[0]); // 숫자 값 내림차순
        });
        
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            pq.offer(new int[]{entry.getKey(), entry.getValue()});
        }
        
        // 상위 k개 숫자 출력
        for (int i = 0; i < k; i++) {
            System.out.print(pq.poll()[0] + " ");
        }
    }
}