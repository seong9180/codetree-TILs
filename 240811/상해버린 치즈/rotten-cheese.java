import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 사람 수
        int M = scanner.nextInt(); // 치즈 수
        int D = scanner.nextInt(); // 치즈를 먹은 기록 수
        int S = scanner.nextInt(); // 아픈 기록 수

        List<int[]> eatingRecords = new ArrayList<>();
        for (int i = 0; i < D; i++) {
            eatingRecords.add(new int[]{scanner.nextInt(), scanner.nextInt(), scanner.nextInt()});
        }

        List<int[]> sickRecords = new ArrayList<>();
        for (int i = 0; i < S; i++) {
            sickRecords.add(new int[]{scanner.nextInt(), scanner.nextInt()});
        }

        int maxSick = 0;

        for (int cheese = 1; cheese <= M; cheese++) {
            boolean canBeSpoiled = true;
            Set<Integer> sickPeople = new HashSet<>();

            for (int[] sickRecord : sickRecords) {
                int person = sickRecord[0];
                int sickTime = sickRecord[1];
                boolean ateCheese = false;

                for (int[] eatingRecord : eatingRecords) {
                    if (eatingRecord[0] == person && eatingRecord[1] == cheese && eatingRecord[2] < sickTime) {
                        ateCheese = true;
                        break;
                    }
                }

                if (!ateCheese) {
                    canBeSpoiled = false;
                    break;
                }
            }

            if (canBeSpoiled) {
                for (int[] eatingRecord : eatingRecords) {
                    if (eatingRecord[1] == cheese) {
                        sickPeople.add(eatingRecord[0]);
                    }
                }
                maxSick = Math.max(maxSick, sickPeople.size());
            }
        }

        System.out.println(maxSick);
        scanner.close();
    }
}