import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.8));
        students.add(new Student("Bob", 3.2));
        students.add(new Student("Charlie", 3.9));
        students.add(new Student("David", 3.5));

        Collections.sort(students);

        System.out.println("Students sorted by GPA:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
