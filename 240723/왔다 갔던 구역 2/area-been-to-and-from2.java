import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] visited = new int[2001];
        int position = 1000;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();            
            char dir = sc.next().charAt(0);

            if (dir == 'L') {
                for (int j = 1; j <= x; j++) {
                    visited[position - j]++;
                }
                position -= x;
            } else { // 'R'
                for (int j = 1; j <= x; j++) {
                    visited[position + j]++;
                }
                position += x;
            }
        }

        int result = 0;
        for (int count : visited) {
            if (count >= 2) {
                result++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}