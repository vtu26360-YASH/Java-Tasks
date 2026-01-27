import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String getName() {
        return name;
    }
    static boolean isOlderThanLimit(Person p, int limit) {
        return p.age > limit;
    }
}
public class Methods{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Person> persons = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            persons.add(new Person(sc.next(), sc.nextInt()));
        }
        int ageLimit = sc.nextInt();
        persons.sort(Comparator.comparing(Person::getName));
        StringBuilder sorted = new StringBuilder();
        StringBuilder filtered = new StringBuilder();
        StringBuilder upper = new StringBuilder();
        for (Person p : persons) {
            sorted.append(p.name).append(" ");
            upper.append(p.name.toUpperCase()).append(" ");

            if (Person.isOlderThanLimit(p, ageLimit)) {
                filtered.append(p.name).append(" ");
            }
        }
        System.out.println(sorted.toString().trim());
        System.out.println(filtered.toString().trim());
        System.out.println(upper.toString().trim());
        sc.close();
    }
}
