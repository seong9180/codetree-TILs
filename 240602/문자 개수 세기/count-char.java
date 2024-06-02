import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text1 = sc.nextLine();
        char word = sc.next().charAt(0);

        int count = 0;
        for(int i = 0; i < text1.length(); i++){
            if(text1.charAt(i) == word){
                count ++;
            }
        }

        System.out.println(count);
    }
}