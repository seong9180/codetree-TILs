import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number_1 = "John";
        String number_2 = "Tom";
        String number_3 = "Paul";

        int n = sc.nextInt();

        if(n == 1){
            System.out.println(number_1);
        }else if(n == 2){
            System.out.println(number_2);
        }else if(n == 3){
            System.out.println(number_3);
        }

    }
}