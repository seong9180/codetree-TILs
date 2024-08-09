import java.util.*;

public class Main {
    static int N, M;
    static List<String> groupA = new ArrayList<>();
    static List<String> groupB = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        // 그룹 A 입력
        for (int i = 0; i < N; i++) {
            groupA.add(scanner.nextLine());
        }

        // 그룹 B 입력
        for (int i = 0; i < N; i++) {
            groupB.add(scanner.nextLine());
        }

        int result = countCombinations();
        System.out.println(result);

        scanner.close();
    }

    static int countCombinations() {
        int count = 0;
        for (int i = 0; i < M - 2; i++) {
            for (int j = i + 1; j < M - 1; j++) {
                for (int k = j + 1; k < M; k++) {
                    if (canDistinguish(i, j, k)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    static boolean canDistinguish(int i, int j, int k) {
        Set<String> setA = new HashSet<>();
        Set<String> setB = new HashSet<>();

        for (String str : groupA) {
            setA.add("" + str.charAt(i) + str.charAt(j) + str.charAt(k));
        }

        for (String str : groupB) {
            setB.add("" + str.charAt(i) + str.charAt(j) + str.charAt(k));
        }

        return Collections.disjoint(setA, setB);
    }
}