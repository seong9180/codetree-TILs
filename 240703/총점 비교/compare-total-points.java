import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student>{
    String name;
    int kor, eng, math;

    public Student(){
        this.name = "";
        this.kor = 0;
        this.eng = 0;
        this.math = 0;
    }

    public Student(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student students){
        return (this.kor + this.math + this.eng) - (students.kor + students.math + students.eng);
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
            students[i].name = sc.next();
            students[i].kor = sc.nextInt();
            students[i].eng = sc.nextInt();
            students[i].math = sc.nextInt();
        }

        Arrays.sort(students);

        for(int i = 0; i< n; i++){
            System.out.println(students[i].name + " " + students[i].kor + " " + students[i].eng + " " + students[i].math);
        }
    }
}