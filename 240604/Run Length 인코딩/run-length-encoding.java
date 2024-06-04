import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        
        char [] str = new char[a.length()];
        for(int i = 0 ; i < a.length(); i++){
            str[i] = a.charAt(i);
        }

        char alpha = str[0];
        int digit_count = 0; //연속해서 등장하는 횟수
        int count_sum = 0; 
        int count_diff_char = 1;

        //Run-Length Encoding 문자열의 길이 출력
        //문자열 길이 1 ~ 1000
        for(int i = 0 ; i <= str.length; i++){ 
            if(i < str.length && str[i] == alpha){
                digit_count ++; 
            }else if(i < str.length){
                if(digit_count >= 100){
                    count_sum += 3; //3자릿수
                }else if(digit_count >= 10){
                    count_sum += 2;
                }else{
                    count_sum += 1;
                }
                digit_count = 1;
                count_diff_char ++; //새로운 문자
                alpha = str[i];
            }else{ //마지막 문자열
                if(digit_count >= 100){
                    count_sum += 3; //3자릿수
                }else if(digit_count >= 10){
                    count_sum += 2;
                }else{
                    count_sum += 1;
                }
            }
        }
        //문자열의 길이 구하는 공식 : (구분된 문자 갯수) + (count_sum) 
        // 테스트 : System.out.println(count_diff_char + " " + count_sum);
        int string_length = count_diff_char + count_sum;
        System.out.println(string_length);


        //Run-Length Encoding 적용 문자열 출력
        int count = 0;
        alpha = str[0];
        for(int i = 0 ; i <= str.length; i++){ //맨 마지막 문자열 출력을 위해 
            if(i < str.length && str[i] == alpha){
                count ++;
            }else if(i < str.length){
                System.out.print(alpha);
                System.out.print(count);
                count = 1; //새로운 문자로 비교를 시작
                //서로 다른 문자가 나왔을 때 해당 인덱스에서 새로운 문자로 alpha 가 바뀌기 때문에 1부터 시작 해줘야 함.
                alpha = str[i];
            }else{ //맨 마지막 문자열 출력을 위해 
                System.out.print(alpha);
                System.out.print(count);
            }
        }
        
    }
}