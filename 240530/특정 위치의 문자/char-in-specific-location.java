import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        char[] alphabet = {'L', 'E', 'B', 'R', 'O', 'S'};

        char input = sc.next().charAt(0);
        boolean check = false;

        int index = -1; //동일한 문자열이 없다면

        for(int i = 0; i < 6; i++){
            if(alphabet[i] == input){
                index = i;
            }
        }

        if(index == -1){
            System.out.println("None");
        }else{
            System.out.println(index);
        }
    }
}