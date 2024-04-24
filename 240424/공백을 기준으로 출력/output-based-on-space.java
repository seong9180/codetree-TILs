import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 2; i++){
            String sentence = sc.nextLine();
            char[] arr = new char[sentence.length()];

            for (int j = 0; j < sentence.length(); j++) {
                arr[j] = sentence.charAt(j);
            }

            for (int j = 0; j < arr.length; j++) {
                if(arr[j] != ' '){
                    System.out.print(arr[j]);
                }
            }
        }
    }
}