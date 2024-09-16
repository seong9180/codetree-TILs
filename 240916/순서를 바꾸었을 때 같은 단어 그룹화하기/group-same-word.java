import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 제거
        Map<String, Integer> map = new HashMap<>();

        // 입력 단어들을 처리
        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            // 단어를 문자 배열로 바꾸고 정렬
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars); // 정렬된 단어

            // 정렬된 단어를 map에 저장, 개수를 세기
            map.put(sortedWord, map.getOrDefault(sortedWord, 0) + 1);
        }

        // 가장 큰 그룹의 크기를 찾기
        int maxGroupSize = Collections.max(map.values());

        // 결과 출력
        System.out.println(maxGroupSize);
    }
}