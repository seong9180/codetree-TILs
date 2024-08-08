import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 받기
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        // 문자열과 숫자의 대응 관계 저장
        String[] stringToNumber = new String[n + 1];
        for (int i = 1; i <= n; i++) {
            stringToNumber[i] = br.readLine();
        }

        // 조사할 문자열 또는 숫자에 대한 결과 출력
        for (int i = 0; i < m; i++) {
            String query = br.readLine();
            if (Character.isDigit(query.charAt(0))) {
                int number = Integer.parseInt(query);
                bw.write(stringToNumber[number] + "\n");
            } else {
                for (int j = 1; j <= n; j++) {
                    if (stringToNumber[j].equals(query)) {
                        bw.write(String.valueOf(j) + "\n");
                        break;
                    }
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}