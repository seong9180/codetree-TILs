import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char input1 = sc.next().charAt(0);
        char input2 = sc.next().charAt(0);

        int asc_input1 = (int)(input1);
        int asc_input2 = (int)(input2);

        if(asc_input1 >= asc_input2){
            System.out.print(asc_input1 + asc_input2 + " ");
            System.out.println(asc_input1 - asc_input2);
        }else{
            System.out.print(asc_input1 + asc_input2 + " ");
            System.out.println(asc_input2 - asc_input1);
        }
    }
}