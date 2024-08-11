import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        Map<Integer, Integer> visits = new TreeMap<>();
        int currentPosition = 0;

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            int distance = Integer.parseInt(command[0]);
            String direction = command[1];

            int step = direction.equals("R") ? 1 : -1;
            int newPosition = currentPosition + (distance * step);

            int start = Math.min(currentPosition, newPosition);
            int end = Math.max(currentPosition, newPosition);

            for (int j = start; j < end; j++) {
                visits.put(j, visits.getOrDefault(j, 0) + 1);
            }

            currentPosition = newPosition;
        }

        int result = 0;
        int count = 0;
        for (int visitCount : visits.values()) {
            if (visitCount >= 2) {
                count++;
            } else {
                if (count > 0) {
                    result += count;
                    count = 0;
                }
            }
        }
        if (count > 0) {
            result += count;
        }

        System.out.println(result);
        scanner.close();
    }
}