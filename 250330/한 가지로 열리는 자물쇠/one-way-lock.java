import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        
        int count = 0;

        // 1부터 N까지의 모든 조합 탐색
        for (int x = 1; x <= N; x++) {
            for (int y = 1; y <= N; y++) {
                for (int z = 1; z <= N; z++) {
                    // OR 조건을 적용하여 자물쇠가 열리는지 확인
                    if (isOpenable(a, b, c, x, y, z)) {
                        count++;
                    }
                }
            }
        }

        // 가능한 조합 개수 출력
        System.out.println(count);
    }

    // 하나라도 차이가 2 이하이면 자물쇠가 열림
    private static boolean isOpenable(int a, int b, int c, int x, int y, int z) {
        return (Math.abs(a - x) <= 2 || Math.abs(b - y) <= 2 || Math.abs(c - z) <= 2);
    }
}
