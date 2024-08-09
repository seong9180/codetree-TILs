import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] aPositions = new int[100001]; // 최대 이동 거리 추정 (100,000)
        int[] bPositions = new int[100001];
        
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
                aPositions[currentTime] = aCurrentPosition;
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
                bPositions[currentTime] = bCurrentPosition;
            }
        }
        
        // 최초로 만나는 시간 찾기
        int meetingTime = -1;
        for (int t = 1; t <= currentTime; t++) {
            if (aPositions[t] == bPositions[t]) {
                meetingTime = t;
                break;
            }
        }
        
        System.out.println(meetingTime);
    }
}