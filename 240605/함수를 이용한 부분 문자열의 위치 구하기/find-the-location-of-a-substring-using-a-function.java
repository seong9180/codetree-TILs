//package study.codetree.mid.function;

import java.util.Scanner;

public class Main {
    public static String str;
    public static String sbstr;

    public static int isSubString() {
        int main_length = str.length();
        int sub_length = sbstr.length();

        for (int i = 0; i <= main_length - sub_length; i++) { //시작 인덱스 범위만 비교
            int j;
            for (j = 0; j < sub_length; j++) {
                if (str.charAt(i + j) != sbstr.charAt(j)) {
                    break;
                }
            }
            if (j == sub_length) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        str = sc.next();
        sbstr = sc.next();

        int target_index = isSubString();

        System.out.println(target_index);

    }
}