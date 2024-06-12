import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char input = sc.next().charAt(0);
        int asc_num = (int)input;

        if(asc_num == 97){
            asc_num = 122;
        }else{
            asc_num --;
        }

        System.out.println((char)asc_num);
        
    }
}