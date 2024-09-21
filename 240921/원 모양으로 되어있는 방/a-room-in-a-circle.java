//package NoviceMid.ExhaustiveSearch;

import java.util.Scanner;

public class Main {
    public static int n;
    public static final int MAX_N = 1003;
    public static int[] room = new int[MAX_N];
    public static int fillEveryRoom(int number, int totalPeople) {
        int totalDistance = 0;
        while(totalPeople > 0){ //방에 들어가야 할 사람들이 다 들어갈 때까지 loop
            totalPeople -= room[number]; //방에 들어가야 하는 인원만큼 빼기
            number = (number + 1) % n; //반 시계 방향으로 다음 방으로 이동
            totalDistance += totalPeople;
            //해당 방에 들어간 사람 제외하고 나머지 인원 모두 이동 +
        }
        return totalDistance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); //방의 갯수
        int totalPeople = 0; //모든 사람 수
        for (int i = 0; i < n; i++) {
            room[i] = sc.nextInt();
            totalPeople += room[i];
        }

        // 방 번호 : 0, 1, 2, 3, ...
        // 반시계 방향 순서로 방 번호를 배치한다고 가정.
        // 사람들은 (방 번호) + 1 / (방 갯수) 로 이동.

        int minCount = 100 * 1003 * 1003; //각 방 최대 인원 * 방 최대 갯수
        for (int i = 0; i < n; i++) {
            //i = room number
            minCount = Math.min(fillEveryRoom(i, totalPeople), minCount);
        }
        System.out.println(minCount);
    }
}