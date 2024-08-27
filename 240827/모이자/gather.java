import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 집의 개수 입력
        int n = scanner.nextInt();
        
        // 각 집에 사는 사람 수 입력
        int[] people = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = scanner.nextInt();
        }
        
        int minTotalDistance = Integer.MAX_VALUE;
        
        // 모든 집에 대해 완전탐색
        for (int meetingPoint = 0; meetingPoint < n; meetingPoint++) {
            int totalDistance = 0;
            
            // 각 집에서 모임 장소까지의 거리 계산
            for (int house = 0; house < n; house++) {
                int distance = Math.abs(house - meetingPoint);
                totalDistance += distance * people[house];
            }
            
            // 최소 거리 갱신
            minTotalDistance = Math.min(minTotalDistance, totalDistance);
        }
        
        // 결과 출력
        System.out.println(minTotalDistance);
        
        scanner.close();
    }
}