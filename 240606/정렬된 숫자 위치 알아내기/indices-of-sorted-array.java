import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 수열의 길이를 입력받습니다.
        int N = scanner.nextInt();
        int[] sequence = new int[N];
        int[] sortedSequence = new int[N];
        
        // 수열을 입력받습니다.
        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextInt();
            sortedSequence[i] = sequence[i];
        }
        
        // 수열을 정렬합니다.
        Arrays.sort(sortedSequence);
        
        // 원래 위치에서 정렬된 후의 위치를 저장할 배열을 만듭니다.
        int[] newIndex = new int[N];
        
        // 각 원소의 원래 위치를 찾습니다.
        for (int i = 0; i < N; i++) {
            // 정렬된 배열에서 해당 원소의 위치를 찾습니다.
            for (int j = 0; j < N; j++) {
                if (sequence[i] == sortedSequence[j]) {
                    newIndex[i] = j + 1; // 위치는 1부터 시작하므로 +1을 합니다.
                    // 중복된 원소의 경우 먼저 나온 원소의 위치를 찾고,
                    // 같은 원소를 다시 찾지 않도록 하기 위해 값을 변경합니다.
                    sortedSequence[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        
        // 결과를 출력합니다.
        for (int i = 0; i < N; i++) {
            System.out.print(newIndex[i] + " ");
        }
    }
}