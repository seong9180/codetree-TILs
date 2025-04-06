import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        List<int[]> questions = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int strike = sc.nextInt();
            int ball = sc.nextInt();
            questions.add(new int[]{num, strike, ball});
        }
        
        // 1~9로 이루어진 3자리 수 중 중복 없는 모든 숫자 후보 생성
        List<String> candidates = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    if (i != j && j != k && i != k) {
                        candidates.add("" + i + j + k);
                    }
                }
            }
        }
        
        int count = 0;
        for (String candidate : candidates) {
            boolean isValid = true;
            for (int[] q : questions) {
                String questionNum = String.valueOf(q[0]);
                int expectedStrike = q[1];
                int expectedBall = q[2];

                int actualStrike = 0;
                int actualBall = 0;

                for (int idx = 0; idx < 3; idx++) {
                    if (candidate.charAt(idx) == questionNum.charAt(idx)) {
                        actualStrike++;
                    } else if (questionNum.contains(String.valueOf(candidate.charAt(idx)))) {
                        actualBall++;
                    }
                }

                if (actualStrike != expectedStrike || actualBall != expectedBall) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                count++;
            }
        }

        System.out.println(count);
    }
}
