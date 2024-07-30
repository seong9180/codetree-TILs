import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[] arr;
    static boolean[] used;
    static List<String> permutations = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        arr = new int[n];
        used = new boolean[n + 1];
        
        generatePermutations(0);
        
        for (int i = permutations.size() - 1; i >= 0; i--) {
            System.out.println(permutations.get(i));
        }
    }

    static void generatePermutations(int depth) {
        if (depth == n) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(arr[i]).append(" ");
            }
            permutations.add(sb.toString().trim());
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!used[i]) {
                arr[depth] = i;
                used[i] = true;
                generatePermutations(depth + 1);
                used[i] = false;
            }
        }
    }
}