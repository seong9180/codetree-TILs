import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            
            switch (command[0]) {
                case "add":
                    int key = Integer.parseInt(command[1]);
                    int value = Integer.parseInt(command[2]);
                    map.put(key, value);
                    break;
                case "remove":
                    key = Integer.parseInt(command[1]);
                    map.remove(key);
                    break;
                case "find":
                    key = Integer.parseInt(command[1]);
                    if (map.containsKey(key)) {
                        System.out.println(map.get(key));
                    } else {
                        System.out.println("None");
                    }
                    break;
            }
        }

        scanner.close();
    }
}