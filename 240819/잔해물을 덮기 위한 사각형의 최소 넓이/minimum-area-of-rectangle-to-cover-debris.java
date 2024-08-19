import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 첫 번째 사각형 입력
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        // 두 번째 사각형 입력
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();
        
        // 좌표 범위 조정 (음수 좌표 처리)
        int offsetX = Math.min(x1, x3) + 1000;
        int offsetY = Math.min(y1, y3) + 1000;
        x1 += offsetX; x2 += offsetX; x3 += offsetX; x4 += offsetX;
        y1 += offsetY; y2 += offsetY; y3 += offsetY; y4 += offsetY;
        
        // 2차원 배열 생성
        int[][] grid = new int[2001][2001];
        
        // 첫 번째 사각형 표시
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                grid[i][j] = 1;
            }
        }
        
        // 두 번째 사각형으로 덮기
        for (int i = x3; i < x4; i++) {
            for (int j = y3; j < y4; j++) {
                grid[i][j] = 2;
            }
        }
        
        // 남은 첫 번째 사각형 영역 계산
        int minX = 2001, maxX = 0, minY = 2001, maxY = 0;
        for (int i = 0; i < 2001; i++) {
            for (int j = 0; j < 2001; j++) {
                if (grid[i][j] == 1) {
                    minX = Math.min(minX, i);
                    maxX = Math.max(maxX, i);
                    minY = Math.min(minY, j);
                    maxY = Math.max(maxY, j);
                }
            }
        }
        
        // 최소 직사각형 넓이 계산
        int area = (maxX - minX + 1) * (maxY - minY + 1);
        
        System.out.println(area);
        
        scanner.close();
    }
}