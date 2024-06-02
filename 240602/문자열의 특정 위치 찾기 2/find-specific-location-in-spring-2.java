import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] string = {"apple", "banana", "grape", "blueberry", "orange"};

        char test_word = sc.next().charAt(0);
        int count = 0;

        for(int i = 0 ;i < 5; i ++){
            boolean check = false;
            for(int j = 2; j < 4; j++){ //3번째~4번째 (인덱스상 2~3)
                if(string[i].charAt(j) == test_word){
                    check = true;
                    System.out.println(string[i]);
                    break;
                }
            }
            if(check){
                count ++;
            }
        }

        System.out.println(count);
        
    }
}