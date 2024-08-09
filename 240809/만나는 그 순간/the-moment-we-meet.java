import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        Map<Integer, Integer> aPositions = new HashMap<>();
        Map<Integer, Integer> bPositions = new HashMap<>();
        
        int aCurrentPosition = 0;
        int bCurrentPosition = 0;
        int currentTime = 0;
        
        // A의 이동 기록
        for (int i = 0; i < N; i++) {
            char direction = sc.next().charAt(0);
            int time = sc.nextInt();
            
            int move = direction == 'R' ? 1 : -1;
            for (int t = 0; t < time; t++) {
                aCurrentPosition += move;
                currentTime++;
                aPositions.put(currentTime, aCurrentPosition);
            }
        }
        
        currentTime = 0;
        
        // B의 이동 기록
        for (int i = 0; i < M; i++) {
            char direction = sc.next().charAt(0);
            int time = sc.nextInt();
            
            int move = direction == 'R' ? 1 : -1;
            for (int t = 0; t < time; t++) {
                bCurrentPosition += move;
                currentTime++;
                bPositions.put(currentTime, bCurrentPosition);
            }
        }
        
        // 최초로 만나는 시간 찾기
        int meetingTime = -1;
        for (int t = 1; t <= currentTime; t++) {
            int aPos = aPositions.getOrDefault(t, 0);
            int bPos = bPositions.getOrDefault(t, 0);
            
            if (aPos == bPos) {
                meetingTime = t;
                break;
            }
        }
        
        System.out.println(meetingTime);
    }
}