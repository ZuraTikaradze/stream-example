package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zura", "Nika", "Mariam", "Anna");
        List<String> names1;

        // 1. მონაცემების შეცვლა
        names1 = names.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(names1);


        // 2. მონაცემზე ინფორმაციის გაგება და დაპრინტვა
        names.stream()
                .map(name -> name.length())
                .forEach(length -> System.out.println(length)); //  .forEach(System.out::println);
        System.out.println(names1);

        // 3. filter  + map ( full time თანამშრომლებს გაუორმაგდეთ ხელფასი)

        System.out.println("----------3-----");
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Zura", "Contractor", 1000),
                new Employee(2, "Nika", "Full_Time", 2500),
                new Employee(1, "Anna", "Full_Time", 3000)
        );

        employeeList.stream()
                .filter(emp -> emp.getType() == "Full_Time")
                .map(emp -> emp.getSal() * 2)
                .forEach(System.out::println);



    }
}
