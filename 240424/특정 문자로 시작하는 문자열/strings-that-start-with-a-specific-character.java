//package practice_.codetree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        double sum = 0;
        char[] initial_letter = new char[n];
        double[] str_size = new double[n];

        sc.nextLine(); //왜 해야 하는지 잘 머르겠음. 추가 공부 예정

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            //System.out.println("str = " + str);
            str_size[i] = str.length();
            initial_letter[i] = str.charAt(0);
        }

        char key = sc.nextLine().charAt(0);
        //System.out.println("key = " + key);

        for (int i = 0; i < n; i++) {
            if(initial_letter[i] == key){
                sum += str_size[i];
                cnt++;
            }
        }
        System.out.print(cnt + " ");
        System.out.printf("%.2f", sum/(double)cnt);
    }
}