import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        // 하나의 HashMap만 사용
        HashMap<String, String> map = new HashMap<>();
        
        // n개의 문자열을 입력받아 HashMap에 저장
        for (int i = 1; i <= n; i++) {
            String str = sc.nextLine();
            // 숫자 -> 문자열
            map.put(String.valueOf(i), str);
            // 문자열 -> 숫자
            map.put(str, String.valueOf(i));
        }
        
        // m개의 조사할 값을 입력받아 대응되는 값을 출력
        for (int i = 0; i < m; i++) {
            String query = sc.nextLine();
            System.out.println(map.get(query));
        }

        sc.close();
    }
}