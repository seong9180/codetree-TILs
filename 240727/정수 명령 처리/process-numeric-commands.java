import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String command = sc.nextLine();
            String[] parts = command.split(" ");

            switch (parts[0]) {
                case "push":
                    int num = Integer.parseInt(parts[1]);
                    stack.push(num);
                    break;
                case "pop":
                    if (!stack.isEmpty()) {
                        System.out.println(stack.pop());
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                case "top":
                    if (!stack.isEmpty()) {
                        System.out.println(stack.peek());
                    }
                    break;
            }
        }

        sc.close();
    }
}