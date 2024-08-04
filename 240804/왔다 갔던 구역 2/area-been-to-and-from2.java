//package NoviceMid.Simulation1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 명령 갯수
        int[] visited = new int[2000]; //시작점 1000, 앞뒤로 1000씩 이동 가능하게 (10 * 100)
        int standard = 1000; // 기준점을 1000에 설정.

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0); //L or R

            if (dir == 'L') {
                for (int j = standard; j > standard - x; j--) {
                    visited[j]++;
                }
                standard -= x; //이동한 거리대로 기준점 수정
            }else{
                for (int j = standard; j < standard + x; j++) {
                    visited[j]++;
                }
                standard += x; //이동한 거리대로 기준점 수정
            }
        }

        int areaCount = 0;
        for (int i = 0; i < 2000; i++) {
            if (visited[i] >= 2) { //2번 이상 지나갔다면,
                areaCount++; //영역의 크기 증가
            }
        }

        System.out.println(areaCount);
    }
}