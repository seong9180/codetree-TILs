import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];
        int[] count1 = new int[n];
        int[] count2 = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            count1[i] = sc.nextInt();
            count2[i] = sc.nextInt();
        }

        int[] first = new int[n];
        int[] second = new int[n];
        int[] third = new int[n];

        //각 자리 비교를 위해 자릿수별로 배열 생성 후 저장.
        for (int i = 0; i < n; i++) {
            first[i] = num[i] / 100;
            second[i] = (num[i] % 100) / 10;
            third[i] = num[i] % 10;
        }

        int possibleCount = 0;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    boolean isValid = false;
                    if (i != j && j != k && i != k) {
                        for (int q = 0; q < n; q++) {
                            int expectedCount1 = 0;
                            int expectedCOunt2 = 0;

                            if (first[q] == i) {
                                expectedCount1++;
                            }else if(first[q] == j || first[q] == k){
                                expectedCOunt2++;
                            }

                            if(second[q] == j){
                                expectedCount1++;
                            }
                            else if(second[q] == i || second[q] == k){
                                expectedCOunt2++;
                            }

                            if(third[q] == k){
                                expectedCount1++;
                            }
                            else if(third[q] == i || third[q] == j){
                                expectedCOunt2++;
                            }

                            //가
                            if (expectedCount1 == count1[q] && expectedCOunt2 == count2[q]) {
                                isValid = true;
                            }else{
                                //모든 n 개의 조건을 만족해야 하기 때문에
                                isValid = false;
                                //한 조건이라도 만족 못하면 false 로 break
                                break;
                            }
                        }
                        if(isValid){
                            possibleCount++;
                        }
                    }
                }
            }
        }

        System.out.println(possibleCount);
    }
}