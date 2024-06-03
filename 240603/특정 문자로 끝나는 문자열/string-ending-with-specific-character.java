import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] string = new String[10];

        for(int i = 0; i < 10; i++){
            string[i] = sc.next();
        }

        char word = sc.next().charAt(0);
        boolean exist = false;

        for(int i = 0 ; i< 10; i++){
            if(string[i].charAt(string[i].length() - 1) == word){
                exist = true;
                System.out.println(string[i]);
            }
        }

        if(!exist){
            System.out.println("None");
        }
    }
}