import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 처리
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        // 두 배열을 정렬
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        // 우선순위 큐 선언 (Min-Heap)
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(pair -> pair[0] + pair[1]));
        
        // 첫 번째 배열의 모든 원소와 두 번째 배열의 첫 번째 원소를 쌍으로 큐에 넣음
        for (int i = 0; i < n; i++) {
            minHeap.offer(new int[]{arr1[i], arr2[0], 0});
        }
        
        // k번째로 작은 합을 찾음
        int result = 0;
        for (int i = 0; i < k; i++) {
            int[] current = minHeap.poll();
            result = current[0] + current[1];
            
            // 다음 가능한 쌍을 큐에 넣음
            if (current[2] + 1 < m) {
                minHeap.offer(new int[]{current[0], arr2[current[2] + 1], current[2] + 1});
            }
        }
        
        // 결과 출력
        System.out.println(result);
        
        scanner.close();
    }
}