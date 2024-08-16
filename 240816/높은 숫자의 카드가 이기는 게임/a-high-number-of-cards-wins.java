import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // B의 카드 배열
        int[] bCards = new int[n];
        for (int i = 0; i < n; i++) {
            bCards[i] = scanner.nextInt();
        }

        // 전체 카드 중 B의 카드를 제외한 A의 카드 배열 생성
        boolean[] used = new boolean[2 * n + 1];
        for (int card : bCards) {
            used[card] = true;
        }

        // A의 카드 리스트 생성
        List<Integer> aCards = new ArrayList<>();
        for (int i = 1; i <= 2 * n; i++) {
            if (!used[i]) {
                aCards.add(i);
            }
        }

        // A와 B의 카드 모두 정렬
        Collections.sort(aCards);
        Arrays.sort(bCards);

        int aIndex = 0, bIndex = 0;
        int score = 0;

        // 두 포인터를 사용해 A와 B의 카드를 비교
        while (aIndex < n && bIndex < n) {
            if (aCards.get(aIndex) > bCards[bIndex]) {
                // A의 카드가 B의 카드보다 큰 경우
                score++;
                bIndex++;
            }
            // A의 카드를 다음으로 넘김
            aIndex++;
        }

        System.out.println(score);
    }
}