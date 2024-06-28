//package study.codetree.mid.sort;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int n; //n은 홀수
    public static final int MAX_N = 100;
    public static int[] arr = new int[MAX_N];

    public static void middleValueOut(int idx, int[] arr) {
        int index = idx / 2; //idx / 2 => 중간 값 인덱스
        // idx == 3, {1, 5, 2} , index == 2
        // 중간값 => 2
        Arrays.sort(arr, 0, idx + 1); //idx 가 이미 인덱스 값이므로, sort 에는 idx + 1
        //System.out.print("index = " + index + " ");
        System.out.print(arr[index] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 0) { //순서상으론 i = 0 이 첫번째 (1 번째) 따라서 짝수여야 함
                middleValueOut(i,arr);
                //System.out.println(arr.length);
            }
        }
        sc.close();
    }
}