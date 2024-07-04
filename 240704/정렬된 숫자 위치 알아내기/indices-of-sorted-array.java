//package study.codetree.mid.sort.instance;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;


class Sequence implements Comparable <Sequence> {
    int value; //수열의 값
    int number; //수열의 번호

    public Sequence(int value, int number) {
        this.value = value;
        this.number = number;
    }

    @Override
    public int compareTo(Sequence s){
        if(this.value == s.value){
            return this.number - s.number;
        }
        return this.value - s.value; //수열의 value 기준으로 오름차순
    }
}

class NewSequence implements Comparable<NewSequence>{
    int value;
    int first_number;
    int sorted_number;

    public NewSequence(int value, int first_number, int sorted_number) {
        this.value = value;
        this.first_number = first_number;
        this.sorted_number = sorted_number;
    }

    @Override
    public int compareTo(NewSequence s) {
        return this.first_number - s.first_number;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //n : 수열의 크기 입력받음
        Sequence[] seq = new Sequence[n]; //n 개의 수를 저장하는 수열 객체 배열 생성
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            int number = i + 1; //number 는 1 부터 시작됨.

            seq[i] = new Sequence(value, number);
        }

        Arrays.sort(seq);
        NewSequence[] newSeq = new NewSequence[n]; //정렬 이후 값을 정리할 새로운 객체 배열 생성
        for (int i = 0; i < n; i++) {
            int value = seq[i].value;
            int first_number = seq[i].number;
            int sorted_number = i + 1;

            newSeq[i] = new NewSequence(value, first_number, sorted_number);
        }
        Arrays.sort(newSeq);
        for(int i = 0; i < n; i++){
            System.out.print(newSeq[i].sorted_number + " ");
        }


    }
}