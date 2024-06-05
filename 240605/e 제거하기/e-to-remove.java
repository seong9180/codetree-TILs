import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        char[] arr = new char[text.length()];

        int first_index = 0;

        for(int i = 0 ; i< text.length(); i++){
            arr[i] = text.charAt(i);
            if(arr[i] == 'e'){
                first_index = i;
                break;
            }
        }

        String new_text = "";
        new_text = text.substring(0,first_index) + text.substring(first_index + 1);
        System.out.println(new_text);
        
    }
}