//package codetree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str_input = sc.nextLine();
        String str_object = sc.nextLine();

        //System.out.println("str_input = " + str_input);
        //System.out.println("str_object = " + str_object);

        System.out.println(str_input.indexOf(str_object));

    }
}