import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    double getCgpa() { return cgpa; }
    String getName() { return name; }
    int getId() { return id; }
}

public class comparater_comparing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            students.add(new Student(
                sc.nextInt(),
                sc.next(),
                sc.nextDouble()
            ));
        }

        // MOST OPTIMAL SORT
        students.sort(
            Comparator.comparing(Student::getCgpa).reversed()
                      .thenComparing(Student::getName)
                      .thenComparing(Student::getId)
        );

        for (Student s : students) {
            System.out.println(s.name);
        }
        sc.close();
    }
}
