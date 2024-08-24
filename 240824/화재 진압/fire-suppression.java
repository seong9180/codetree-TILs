import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 화재 발생 가능 위치의 수
        int m = sc.nextInt(); // 소방서의 수

        int[] firePositions = new int[n];
        int[] fireStations = new int[m];

        // 화재 발생 가능 위치 입력
        for (int i = 0; i < n; i++) {
            firePositions[i] = sc.nextInt();
        }

        // 소방서 위치 입력
        for (int i = 0; i < m; i++) {
            fireStations[i] = sc.nextInt();
        }

        // 위치들을 정렬
        Arrays.sort(firePositions);
        Arrays.sort(fireStations);

        int maxTime = 0;
        int stationIndex = 0;

        for (int firePos : firePositions) {
            // 가장 가까운 소방서 찾기
            while (stationIndex < m - 1 && 
                   Math.abs(fireStations[stationIndex] - firePos) >= 
                   Math.abs(fireStations[stationIndex + 1] - firePos)) {
                stationIndex++;
            }

            // 현재 화재 위치에서 가장 가까운 소방서까지의 거리 계산
            int time = Math.abs(fireStations[stationIndex] - firePos);
            maxTime = Math.max(maxTime, time);
        }

        System.out.println(maxTime);
    }
}