package victor.training.intellij.speed;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import victor.training.intellij.support.dirty.Customer;
import victor.training.intellij.support.dirty.Rental;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class IntelliJPlay {
    private static final Logger log = LoggerFactory.getLogger(IntelliJPlay.class);

    public static void main(String[] args) {
        List<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).toList();
        Person person = new Person();


        String name = person.getLastName().toUpperCase();

        String corporateName = extractCorporateName(person);
        List<Person> persons = Arrays.asList(new Person());

        List<String> names = new ArrayList<>();
        for (Person person1 : persons) {
            String s = extractCorporateName(person1);
            names.add(s);
        }

        System.out.println(names);


        Set<Integer> set = numbers.stream().map(n -> n + 1).collect(toSet());

        for (String address : person.getAddresses()) {
            System.out.println(address);
            log.debug(address);
        }

        f3(1, 2, 3, numbers, person);
        f3a(numbers, person);

        Customer customer = new Customer();
        List<Integer> list = customer.getRentals().stream().map(Rental::getDaysRented).collect(toList());
        System.out.println(list);
        method(customer.getRentals());
    }

    private static void f3(int i, int i1, int i2, List<Integer> customerIds, Person person) {
        f2(customerIds, person);
    }

    private static void f3a(List<Integer> numbers, Person person) {
        f2(numbers, person);
    }

    private static void f35(List<Integer> numbers, Person person) {
        f2(numbers, person);
    }

    private static void f2(List<Integer> numbers, Person person) {
        f1(numbers, person);
    }

    private static void f1(List<Integer> numbers, Person person) {
        person.someNewMethod(numbers);
        log.debug("lost");
        LocalDateTime now = LocalDateTime.now();
        timeBased(now);
    }

    private static String extractCorporateName(Person person) {
        return person.getFirstName() + " " + person.getLastName().toUpperCase();
    }

    public static void method(List<Rental> rentals) {
        rentals.clear();
    }

    public static void timeBased(LocalDateTime dateTime) {
        System.out.println("Logic with " + dateTime);
        System.out.println("asdsad");
    }


}

