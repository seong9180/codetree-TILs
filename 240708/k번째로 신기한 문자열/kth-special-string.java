import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄 입력 처리
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String T = scanner.next();
        scanner.nextLine(); // 다음 줄로 이동

        // n개의 단어 입력 처리
        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            words.add(scanner.nextLine());
        }

        // T로 시작하는 단어들 필터링
        List<String> filteredWords = new ArrayList<>();
        for (String word : words) {
            if (word.startsWith(T)) {
                filteredWords.add(word);
            }
        }

        // 사전순으로 정렬
        Collections.sort(filteredWords);

        // k번째 단어 출력 (0-indexed에서 1-indexed로 변경)
        System.out.println(filteredWords.get(k - 1));
    }
}