import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] A = new int[2001]; // A의 위치를 저장할 배열
        int[] B = new int[2001]; // B의 위치를 저장할 배열
        
        int time = 0;
        int posA = 1000; // 시작점을 1000으로 설정
        int posB = 1000; // 시작점을 1000으로 설정
        
        // A의 이동 처리
        for (int i = 0; i < N; i++) {
            String direction = sc.next();
            int duration = sc.nextInt();
            
            for (int j = 0; j < duration; j++) {
                time++;
                if (direction.equals("R")) posA++;
                else posA--;
                A[time] = posA;
            }
        }
        
        // B의 이동 처리
        time = 0;
        for (int i = 0; i < M; i++) {
            String direction = sc.next();
            int duration = sc.nextInt();
            
            for (int j = 0; j < duration; j++) {
                time++;
                if (direction.equals("R")) posB++;
                else posB--;
                B[time] = posB;
            }
        }
        
        // 만나는 시간 찾기
        for (int i = 1; i <= time; i++) {
            if (A[i] == B[i]) {
                System.out.println(i);
                return;
            }
        }
        
        // 만나지 않는 경우
        System.out.println(-1);
        
        sc.close();
    }
}