package victor.training.intellij.speed;


import victor.training.intellij.support.dirty.Customer;
import victor.training.intellij.support.dirty.Rental;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;


public class IntelliJPlay {
   public static void main(String[] args) {
      List<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).toList();
      Person person = new Person();

//      log.debug("ast");

      Set<Integer> set = numbers.stream().map(n -> n + 1).collect(toSet());


      person.someNewMethod(numbers);
      LocalDateTime now;
      timeBased(person.getCreateTime());

      Customer customer = new Customer();
      List<Integer> list = customer.getRentals().stream().map(Rental::getDaysRented).collect(toList());
      System.out.println(list);
      method(customer.getRentals());
   }





   public static void method(List<Rental> rentals) {
      rentals.clear();
   }

   public static void timeBased(LocalDateTime dateTime) {
      System.out.println("Logic with " + dateTime);
      System.out.println("asdsad");
   }


}

