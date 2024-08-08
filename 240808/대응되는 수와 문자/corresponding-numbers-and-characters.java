import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        // 문자열과 숫자의 대응 관계 저장
        String[] stringToNumber = new String[n + 1];
        for (int i = 1; i <= n; i++) {
            stringToNumber[i] = scanner.nextLine();
        }

        // 조사할 문자열 또는 숫자에 대한 결과 출력
        for (int i = 0; i < m; i++) {
            String query = scanner.nextLine();
            if (Character.isDigit(query.charAt(0))) {
                int number = Integer.parseInt(query);
                System.out.println(stringToNumber[number]);
            } else {
                for (int j = 1; j <= n; j++) {
                    if (stringToNumber[j].equals(query)) {
                        System.out.println(j);
                        break;
                    }
                }
            }
        }
    }
}