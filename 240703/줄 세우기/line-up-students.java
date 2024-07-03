import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

class Student implements Comparable<Student>{
    int number;
    int height, weight;

    public Student(){
        this.number = 0;
        this.height = 0;
        this.weight = 0;
    }

    public Student(int number ,int height, int weight){
        this.number = number;
        this.height = height;
        this.weight = weight;
    }
    
    @Override
    public int compareTo(Student students){
        //키 높은 순 >> 몸무게 높은 순>> 번호 작은 순서로 정렬
        if(this.height == students.height){
            if(this.weight == students.weight){
                return this.number - students.number; //번호 낮은 순
            }
            return students.weight - this.weight; //몸무게 높은 순
        }
        return students.height - this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i = 0; i< n; i++){
            students[i] = new Student();
            students[i].height = sc.nextInt();
            students[i].weight = sc.nextInt();
            students[i].number = i + 1; //1번부터 시작
        }

        Arrays.sort(students); //기준에 맞게 정렬

        for(int i = 0 ; i< n ;i++){
            int height = students[i].height;
            int weight = students[i].weight;
            int number = students[i].number;
            System.out.println(height + " " + weight + " " + number);
        }
    }
}