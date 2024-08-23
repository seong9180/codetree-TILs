import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 1부터 N까지의 숫자
        int K = sc.nextInt(); // 연속해야 하는 숫자의 개수
        int B = sc.nextInt(); // 빠진 숫자의 개수
        
        boolean[] present = new boolean[N + 1]; // 숫자의 존재 여부를 저장하는 배열
        Arrays.fill(present, true); // 초기에 모든 숫자가 존재한다고 가정
        
        // 빠진 숫자 입력 받기
        for (int i = 0; i < B; i++) {
            int missing = sc.nextInt();
            present[missing] = false;
        }
        
        // 슬라이딩 윈도우를 사용하여 최소 추가 개수 계산
        int missingCount = 0;
        for (int i = 1; i <= K; i++) {
            if (!present[i]) missingCount++;
        }
        
        int minAddition = missingCount;
        
        for (int i = K + 1; i <= N; i++) {
            if (!present[i - K]) missingCount--;
            if (!present[i]) missingCount++;
            minAddition = Math.min(minAddition, missingCount);
        }
        
        System.out.println(minAddition);
        
        sc.close();
    }
}