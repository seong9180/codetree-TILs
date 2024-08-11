import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 학생 수
        int B = sc.nextInt(); // 예산
        
        int[][] students = new int[N][2];
        for (int i = 0; i < N; i++) {
            students[i][0] = sc.nextInt(); // 선물 가격
            students[i][1] = sc.nextInt(); // 배송비
        }
        
        // 선물 가격 + 배송비의 합으로 정렬
        Arrays.sort(students, (a, b) -> (a[0] + a[1]) - (b[0] + b[1]));
        
        int maxStudents = 0;
        int totalCost = 0;
        
        // 쿠폰을 사용하지 않고 최대한 많은 학생에게 선물
        for (int i = 0; i < N; i++) {
            if (totalCost + students[i][0] + students[i][1] <= B) {
                totalCost += students[i][0] + students[i][1];
                maxStudents++;
            } else {
                break;
            }
        }
        
        // 쿠폰을 사용하여 추가로 선물할 수 있는지 확인
        for (int i = 0; i < N; i++) {
            int newTotalCost = totalCost - (students[i][0] / 2);
            int newMaxStudents = maxStudents;
            
            for (int j = maxStudents; j < N; j++) {
                if (newTotalCost + students[j][0] + students[j][1] <= B) {
                    newTotalCost += students[j][0] + students[j][1];
                    newMaxStudents++;
                } else {
                    break;
                }
            }
            
            maxStudents = Math.max(maxStudents, newMaxStudents);
        }
        
        System.out.println(maxStudents);
    }
}