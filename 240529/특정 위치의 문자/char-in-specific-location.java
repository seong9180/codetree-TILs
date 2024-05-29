import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        char[] alphabet = {'L', 'E', 'B', 'R', 'O', 'S'};

        char input = sc.next().charAt(0);
        boolean check = false;

        for(int i = 0; i < 5; i++){
            if(alphabet[i] == input){
                System.out.print(i);
                check = true;
            }else{
                check = false;
                continue;
            }
        }
        
        if(!check){
            System.out.print("None");
        }
    }
}