import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        // 문자열과 숫자의 대응 관계 저장
        HashMap<String, Integer> stringToNumber = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String str = scanner.nextLine();
            stringToNumber.put(str, i);
        }

        // 조사할 문자열 또는 숫자에 대한 결과 출력
        for (int i = 0; i < m; i++) {
            String query = scanner.nextLine();
            if (Character.isDigit(query.charAt(0))) {
                int number = Integer.parseInt(query);
                for (String key : stringToNumber.keySet()) {
                    if (stringToNumber.get(key) == number) {
                        System.out.println(key);
                        break;
                    }
                }
            } else {
                if (stringToNumber.containsKey(query)) {
                    System.out.println(stringToNumber.get(query));
                }
            }
        }
    }
}