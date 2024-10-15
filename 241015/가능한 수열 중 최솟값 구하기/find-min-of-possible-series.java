import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static List<Integer> list;
    static String answer;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        answer = "";

        permutation(0);

        sb.append(answer);

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

    private static void permutation(int depth) {
        if (depth == n) {
            for (Integer idx : list) {
                System.out.print(idx);
            }
            System.exit(0);
        }

        for (int i=4; i<=6; i++) {
            list.add(i);
            if (available()) {
                permutation(depth + 1);
            }
            list.remove(list.size() - 1);
        }
    }

    private static boolean available() {
        int length = 1;

        while (true) {
            int end1 = list.size() - 1;
            int start1 = end1 - length + 1;
            int end2 = start1 - 1;
            int start2 = end2 - length + 1;

            if (start2 < 0) {
                break;
            }

            if (isEqual(start1, end1, start2, end2)) {
                return false;
            }

            length++;
        }

        return true;
    }

    private static boolean isEqual(int start1, int end1, int start2, int end2) {
        for (int i=0; i<= end1 - start1; i++) {
            if (list.get(start1 + i) != list.get(start2 + i)) {
                return false;
            }
        }

        return true;
    }
}