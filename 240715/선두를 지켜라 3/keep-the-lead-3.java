import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        List<Integer> distanceA = new ArrayList<>();
        List<Integer> distanceB = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                distanceA.add(v);
            }
        }

        for (int i = 0; i < M; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                distanceB.add(v);
            }
        }

        int size = distanceA.size();
        int positionA = 0;
        int positionB = 0;
        int changes = 0;
        int lastLeader = 0;  // 0: no leader, 1: A, 2: B, 3: both

        for (int i = 0; i < size; i++) {
            positionA += distanceA.get(i);
            positionB += distanceB.get(i);

            int currentLeader;
            if (positionA > positionB) {
                currentLeader = 1;
            } else if (positionA < positionB) {
                currentLeader = 2;
            } else {
                currentLeader = 3;
            }

            if (currentLeader != lastLeader) {
                changes++;
                lastLeader = currentLeader;
            }
        }

        System.out.println(changes);
    }
}