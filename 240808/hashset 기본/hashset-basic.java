import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 명령의 개수
        sc.nextLine(); // 개행 문자 처리
        
        // HashSet을 생성
        HashSet<Integer> set = new HashSet<>();
        
        // 명령어를 처리
        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();
            String[] parts = command.split(" ");
            String operation = parts[0];
            int x = Integer.parseInt(parts[1]);
            
            if (operation.equals("add")) {
                set.add(x);
            } else if (operation.equals("remove")) {
                set.remove(x);
            } else if (operation.equals("find")) {
                if (set.contains(x)) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
        }
        
        sc.close();
    }
}