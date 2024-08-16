import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String initial = br.readLine();
        String target = br.readLine();
        
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            if (initial.charAt(i) != target.charAt(i)) {
                count++;
                i += 3;  // 구간의 크기가 최대 4이므로, 다음 3개 문자는 무시
            }
        }
        
        System.out.println(count);
    }
}