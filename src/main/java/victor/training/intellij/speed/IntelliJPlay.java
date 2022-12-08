package victor.training.intellij.speed;


import victor.training.intellij.speed.Person.MaritalStatus;
import victor.training.intellij.support.dirty.Customer;
import victor.training.intellij.support.dirty.Rental;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static org.assertj.core.api.Assertions.assertThat;


public class IntelliJPlay {
  public static void main(String[] args) {
    Person person = new Person();

    Customer customer = new Customer();
    List<Integer> list = new ArrayList<>();
    for (Rental rental : customer.getRentals()) {
      list.add(rental.getDaysRented());
    }
    System.out.println(list);
    method(customer.getRentals());
  }

  public static void introduce(String firstName, MaritalStatus maritalStatus) {
     System.out.println("This is " + firstName + (maritalStatus == MaritalStatus.SINGLE ? "😉" : ""));
  }


  public static void method(List<Rental> rentals) {
    rentals.clear();
  }


}

