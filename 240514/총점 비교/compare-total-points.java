//package study.codetree.samsung.object_sort;

import java.util.Arrays;
import java.util.Scanner;

class Student_1 implements Comparable<Student_1> {
    String name;
    int kor;
    int eng;
    int math;

    public Student_1() {
        String name = "no data";
        int kor = 0;
        int eng = 0;
        int math = 0;
    }

    public Student_1(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int compareTo(Student_1 student) {
        return (this.kor + this.eng + this.math) - (student.kor + student.eng + student.math);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student_1[] students = new Student_1[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student_1();
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