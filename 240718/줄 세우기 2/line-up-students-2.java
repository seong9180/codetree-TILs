import java.util.*;

public class Main {
    static class Student {
        int height;
        int weight;
        int number;

        Student(int height, int weight, int number) {
            this.height = height;
            this.weight = weight;
            this.number = number;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int height = scanner.nextInt();
            int weight = scanner.nextInt();
            students.add(new Student(height, weight, i + 1));
        }

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.height != s2.height) {
                    return Integer.compare(s1.height, s2.height);
                } else {
                    return Integer.compare(s2.weight, s1.weight);
                }
            }
        });

        for (Student s : students) {
            System.out.println(s.height + " " + s.weight + " " + s.number);
        }
    }
}