import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] points = new int[n];
        for (int i = 0; i < n; i++) {
            points[i] = sc.nextInt();
        }
        
        // 점들을 정렬
        Arrays.sort(points);
        
        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            
            // 이분 탐색으로 start보다 크거나 같은 첫 번째 점 찾기
            int leftIndex = lowerBound(points, start);
            // 이분 탐색으로 end보다 작거나 같은 마지막 점 찾기
            int rightIndex = upperBound(points, end);
            
            // 선분 내에 있는 점의 개수 계산
            int count = rightIndex - leftIndex + 1;
            System.out.println(count > 0 ? count : 0);
        }
    }
    
    // lowerBound: target 이상인 첫 위치 반환
    public static int lowerBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    
    // upperBound: target 이하인 마지막 위치 반환
    public static int upperBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left - 1;
    }
}