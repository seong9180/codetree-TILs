import java.util.*;

public class Main {
    static int N, M;
    static String[] groupA, groupB;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        groupA = new String[N];
        groupB = new String[N];

        for (int i = 0; i < N; i++) {
            groupA[i] = sc.nextLine();
        }
        for (int i = 0; i < N; i++) {
            groupB[i] = sc.nextLine();
        }

        int result = countCombinations();
        System.out.println(result);

        sc.close();
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