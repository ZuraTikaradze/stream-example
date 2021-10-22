package filter;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45, 50);
        List<Integer> nums1;

        // 1. ლისთში ჩაყრა & დაბეჭვდა
        nums1 = nums.stream() // მონაცემების სტრიმად გარდაქმნა
                .filter(n -> n % 2 == 0) // ფილტრაცია
                .collect(Collectors.toList()); // კოლექციად გარდაქმნა
        System.out.println(nums1);// დაპრინტვა

        // 2. პირდაპირ დაბეჭვდა
        nums.stream() // მონაცემების სტრიმად გარდაქმნა
                .filter(n -> n % 2 == 1) // ფილტრაცია
                .forEach(System.out::println);// .forEach(n -> System.out.println(n));  // იტერაცია

        // 2. ობიექტის დაპრინტვა პირდაპირ
        List<Student> students = Arrays.asList(new Student(1, "Zura", 1), new Student(2, "Giorgi", 2), new Student(3, "anna", 3));

        students.stream()  // მონაცემების სტრიმად გარდაქმნა
                .filter(n -> n.getAge() > 2) // ფილტრაცია
                .forEach(System.out::println); // იტერაცია

    }
}
