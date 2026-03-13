import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Student> students;
    public static void main(String[] args) {
        students = new ArrayList<Student>();
        students.add(new Student(398639, "Alice", 3.6));
        students.add(new Student(774789, "Bob", 3.9));
        students.add(new Student(678392, "Charlie", 3.7));
        students.add(new Student(693856, "David", 4.0));
        students.add(new Student(583920, "Eve", 3.8));
        students.add(new Student(483920, "Frank", 3.8));
        students.sort(null);
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}