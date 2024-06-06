//package study.codetree.low;

import java.util.Scanner;

public class Main {
    public static int firstIndexOfSameSubstring(String a, String b) {
        //겹치는 부분 문자열의 시작 인덱스를 반환하는 함수 1 (겹치는 부분이 없다면 -1 출력)
        //"인덱스" 를 반환하기 때문에 별도의 변경이 필요 없이 바로 사용하면 됨
        int main_length = a.length();
        int obj_length = b.length();

        for (int i = 0; i <= (main_length - obj_length); i++) {
            int j;
            for (j = 0; j < obj_length; j++) {
                if (a.charAt(i + j) != b.charAt(j)) {
                    break;
                }
            }
            if(j == obj_length) {
                return i;
            }
        }
        return -1;
    }

    public static String newCombinedString(int i, String a, String b) {
        //부분 문자열의 시작 인덱스를 입력하면 해당 부분을 제거하고 새롭게 문자열을 정의하는 함수 2
        int main_length = a.length();
        int obj_length = b.length();

        a = a.substring(0, i) + a.substring(i + obj_length);
        //substring(0,index) + substring(index + length) 해야 범위에 맞음.
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        문자열 a, b
        1. a 의 부분문자열 중, 가장 앞에 등장하는 b 와 같은 문자열 찾기
        2. 삭제
        3. 지우고 난 후 떨어진 a 의 문자열 다시 붙이기
        4. 새로운 문자열 a 에서 b 와 같은 부분 문자열 없어질 때까지 반복하기
        */

        //문자열 a,b 선언
        String A = sc.next();
        String B = sc.next();

        while (true) {
            if (firstIndexOfSameSubstring(A, B) == -1) { //겹치는 부분문자열이 없다면
                System.out.println(A); //문자열 a 출력하고 루프 종료
                break;
            }else{
                int idx = firstIndexOfSameSubstring(A,B); //부분문자열의 시작 인덱스 저장
                A = newCombinedString(idx, A, B); //문자열a 재정의
            }
        }
    }
}