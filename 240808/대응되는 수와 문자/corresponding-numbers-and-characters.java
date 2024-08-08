import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리
        
        // 두 개의 HashMap 생성
        HashMap<Integer, String> numToStrMap = new HashMap<>();
        HashMap<String, Integer> strToNumMap = new HashMap<>();
        
        // n개의 문자열을 입력받아 HashMap에 저장
        for (int i = 1; i <= n; i++) {
            String str = sc.nextLine();
            numToStrMap.put(i, str);
            strToNumMap.put(str, i);
        }
        
        // m개의 조사할 값을 입력받아 대응되는 값을 출력
        for (int i = 0; i < m; i++) {
            String query = sc.nextLine();
            
            // 입력이 숫자인지 문자열인지 판단
            if (isNumeric(query)) {
                int num = Integer.parseInt(query);
                System.out.println(numToStrMap.get(num));
            } else {
                System.out.println(strToNumMap.get(query));
            }
        }
        
        sc.close();
    }
    
    // 입력된 문자열이 숫자인지 확인하는 메소드
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}