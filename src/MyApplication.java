

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyApplication {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Aldiar", "Zhaksylykov", "Director", 900000.78);
        Employee employee2 = new Employee("Marzhan", "Kim", "Improver", 780000.00);
        Student student1 = new Student("Arman", "Alimbekov", 3.89);
        Student student2 = new Student("Erkebulan", "Maratov", 2.32);

        List<Person> people = new ArrayList<>();
        people.add(employee1);
        people.add(employee2);
        people.add(student1);
        people.add(student2);

        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> persons) {
        for (Person people : persons) {
            System.out.println(people + " earns " + String.format("%.2f", people.getPaymentAmount()) + " tenge");
        }
    }
}
