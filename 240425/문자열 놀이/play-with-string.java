//package codetree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int q = sc.nextInt();
        int length = s.length();

        char[] arr = new char[length];
        for (int i = 0; i < length; i++) {
            arr[i] = s.charAt(i);
        }

        //System.out.println("s = " + s);
        //System.out.println("q = " + q);

        for (int i = 0; i < q; i++) {
            int command = sc.nextInt(); // 1 OR 2

            if(command == 1){
                //System.out.println("command = " + command);
                int a = sc.nextInt();
                int b = sc.nextInt();
                //System.out.println("a = " + a);
                //System.out.println("b = " + b);

                char temp = arr[a-1]; //temp = 'a'
                //System.out.println("temp>arr[a-1] = " + temp);
                arr[a-1] = arr[b-1]; //arr[1] = 'd'
                //System.out.println("arr[a-1]>arr[b-1] = " + arr[a-1]);
                arr[b-1] = temp; //arr[3] = 'a'

                //System.out.println("arr[b-1]>temp = " + arr[b-1]);
                s = String.valueOf(arr);
                System.out.println(s);
            }else{ //command == 2
                //System.out.println("command = " + command);
                //System.out.println("command 2 진입성공");
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                //System.out.println("a = " + a);
                //System.out.println("b = " + b);

                for (int j = 0; j < length; j++) {
                    if(arr[j] == a){
                        arr[j] = b;
                    }
                }
                s = String.valueOf(arr);
                System.out.println(s);
            }
        }

    }
}