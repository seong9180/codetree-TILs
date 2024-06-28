//package study.codetree.mid.sort;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int n,k;
    public static final int MAX_N = 100;
    public static String[] word = new String[MAX_N];
    public static String T;
    public static boolean ifTassociativeStr(String t, String str){
        char[] arr = str.toCharArray();
        int length = t.length();
        for(int i = 0; i < length; i++){
            if(t.charAt(i) == arr[i]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void kthStrOut (int count){
        String[] startWithT = new String[count];
        int j = 0; //starWithT 의 크기는 count (<= n) 이라서 별도의 인덱스 변수를 선언
        for(int i = 0 ; i < n; i++){
            if(ifTassociativeStr(T,word[i])){ //T로 시작한다면
                startWithT[j] = word[i];
                j++; //ifTassociativeStr == true 일 때만 j ++
            }
        }
        for(int i = 0 ; i < count; i++){
            //System.out.println(startWithT[i]); 테스트용
        }
        Arrays.sort(startWithT);
        //k번째 문자 출력
        System.out.println(startWithT[k-1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();
        T = sc.next();
        int count = 0; //T 로 시작하는 문자열 갯수
        for(int i = 0 ; i < n; i++){
            word[i] = sc.next();
            if(ifTassociativeStr(T,word[i])){ //T로 시작한다면
                count ++;
                //System.out.println(word[i]);
            }
        }
        kthStrOut(count);
    }
}