import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 처리
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        
        int[] array1 = new int[n];
        int[] array2 = new int[m];
        
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < m; i++) {
            array2[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        // 두 배열을 정렬
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        // 최소 힙을 사용하여 k번째 작은 합을 찾음
        PriorityQueue<Pair> minHeap = new PriorityQueue<>();
        
        for (int i = 0; i < n; i++) {
            minHeap.offer(new Pair(array1[i], array2[0], 0));
        }
        
        int count = 0;
        int result = 0;
        
        while (!minHeap.isEmpty()) {
            Pair current = minHeap.poll();
            count++;
            
            if (count == k) {
                result = current.sum();
                break;
            }
            
            if (current.indexInArray2 < m - 1) {
                minHeap.offer(new Pair(current.num1, array2[current.indexInArray2 + 1], current.indexInArray2 + 1));
            }
        }
        
        System.out.println(result);
    }
    
    static class Pair implements Comparable<Pair> {
        int num1;
        int num2;
        int indexInArray2;
        
        Pair(int num1, int num2, int indexInArray2) {
            this.num1 = num1;
            this.num2 = num2;
            this.indexInArray2 = indexInArray2;
        }
        
        int sum() {
            return num1 + num2;
        }
        
        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.sum(), other.sum());
        }
    }
}