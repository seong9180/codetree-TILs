import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        int answer = Integer.MAX_VALUE; // 21e8에 해당하는 큰 값
        
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) continue;
            for (int j = 0; j <= 100; j++) {
                if (j % 2 == 1) continue;
                
                int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
                
                // 모든 점을 비교하여 각 영역의 점 개수 계산
                for (int k = 0; k < n; k++) {
                    if (x[k] < i && y[k] > j) num1++;
                    else if (x[k] > i && y[k] > j) num2++;
                    else if (x[k] > i && y[k] < j) num3++;
                    else num4++;
                }
                
                // 네 영역 중 가장 많은 점이 있는 영역의 점 개수 찾기
                int maxNum = Math.max(num1, Math.max(num2, Math.max(num3, num4)));
                
                // 최소값 업데이트
                answer = Math.min(answer, maxNum);
            }
        }
        
        System.out.println(answer);
    }
}
