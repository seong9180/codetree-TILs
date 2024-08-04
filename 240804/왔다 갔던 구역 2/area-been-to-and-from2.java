import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 명령 갯수
        HashMap<Integer, Integer> visited = new HashMap<>();
        int position = 0; // 현재 위치

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0); //L or R

            if (dir == 'L') {
                for (int j = position - 1; j > position - x; j--) {
                    visited.put(j, visited.getOrDefault(j, 0) + 1);
                }
                position -= x;
            } else {
                for (int j = position; j < position + x - 1; j++) {
                    visited.put(j, visited.getOrDefault(j, 0) + 1);
                }
                position += x - 1;
            }
        }

        int areaCount = 0;
        for (int count : visited.values()) {
            if (count >= 2) {
                areaCount++;
            }
        }

        System.out.println(areaCount);
    }
}