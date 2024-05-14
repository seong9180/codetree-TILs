//package study.codetree.samsung.object_sort;

import java.util.Arrays;
import java.util.Scanner;

class Student_score implements Comparable<Student_score>{
    String name;
    int kor;
    int eng;
    int math;

    public Student_score (){
        this.name = "no data";
        this.kor = 0;
        this.eng = 0;
        this.math = 0;
    }

    public Student_score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int compareTo(Student_score studentScore) {
        if (this.kor == studentScore.kor) {
            if (this.eng == studentScore.eng) {
                return studentScore.math - this.math;
            }
            return studentScore.eng - this.eng;
        }
        return studentScore.kor - this.kor;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student_score[] students = new Student_score[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student_score();
            students[i].name = sc.next();
            students[i].kor = sc.nextInt();
            students[i].eng = sc.nextInt();
            students[i].math = sc.nextInt();
        }
        //System.out.println("--answer--");
        Arrays.sort(students);
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].name + " " + students[i].kor + " " + students[i].eng + " " + students[i].math);
        }
    }
}