import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 점의 개수 n과 선분의 개수 m 입력
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // 점들의 좌표 입력
        int[] points = new int[n];
        for (int i = 0; i < n; i++) {
            points[i] = scanner.nextInt();
        }
        
        // 점들을 정렬
        Arrays.sort(points);
        
        // 각 선분에 대해 점의 개수 계산
        for (int i = 0; i < m; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            
            // 이진 탐색을 사용하여 선분 내의 점 개수 계산
            int startIndex = lowerBound(points, start);
            int endIndex = upperBound(points, end);
            
            System.out.println(endIndex - startIndex);
        }
        
        scanner.close();
    }
    
    // 하한 값(start 이상인 첫 번째 원소의 인덱스)을 찾는 메서드
    private static int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    
    // 상한 값(end 초과인 첫 번째 원소의 인덱스)을 찾는 메서드
    private static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}