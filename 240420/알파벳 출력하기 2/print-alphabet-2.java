import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int index = 0;

        // 채우는 구문
        char[] arr = new char[26];

        // 배열의 길이만큼 i값 증가
        for(int i=0;i<arr.length;i++)
        {
            // ASCII Code를 char로 형변환하여 배열에 담기
            arr[i] = (char)(65+i);
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++) {
                //공백 부분
                System.out.print("  ");
            }

            for(int j = i; j < n; j++){
                //알파벳 출력 부분.
                if(index == 26){
                    index = 0;
                    System.out.print(arr[index] + " ");
                    index ++;
                }
                else{
                    System.out.print(arr[index] + " ");
                    index ++;
                }
            }

            System.out.println();

        }
    }
}