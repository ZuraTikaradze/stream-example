package flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<List<Integer>> mainList = new ArrayList<>();

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(7, 8, 9);


        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);


        // map -ის შემთხვევაში ცალცალკე ობჯექტებად მოგვაქვს
        mainList.stream()
                .map(n -> n.stream())
                .forEach(System.out::println); // დაბეჭდავს ლისთის მიმთითებლებს რადგან ცალცალკე ობჯექტებად აღიქვამს

        // ფლეთ მეპის შემთხვევაში. ანუ აბრტყელებს მონააცემებს
        mainList.stream()
                .flatMap(n -> n.stream())
                .forEach(System.out::println); // დაბეჭდავს რიცხვებს რადგან ფლათმეპი აბრტყელებს მონაცემებს


        // map -ის შემთხვევაში ცალცალკე ობჯექტებად მოგვაქვს
        mainList.stream()  // მთლიანი კოლექფცია გადავაგდე სტრიმში
                .map(n -> n.stream() // კოლექციაში არსებულო კოლექციები სათითაოდ გადავაგდე სტრიმში
                        .map(v -> v + 10) // კოლექციაში არსებული კოლექციის ელემენტებს დავუმატე 10-ი
                        .collect(Collectors.toList()))// შემდეგ შევქმენი განახლებული მონაცემების კოლექციები
                .forEach(System.out::println); //  გამოვიტანე ეკრანზე სათითაოდ

        // ფლეთ მეპის შემთხვევაში. ანუ აბრტყელებს მონააცემებს
        mainList.stream() // კოლექცია გადავაგდე სტრიმში
                .flatMap(n -> n.stream() // ფლეთმეპით გავაპრტყელე მონაცემები და გადავაგდე სტრიმში
                        .map(v -> v * 10)) // გავამრავლე 10 -ზე
                .forEach(System.out::println);
    }
}
