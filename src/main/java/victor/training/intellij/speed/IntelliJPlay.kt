package victor.training.intellij.speed

import victor.training.intellij.support.dirty.Customer
import victor.training.intellij.support.dirty.Rental
import java.time.LocalDateTime
import java.util.stream.Collectors
import java.util.stream.Stream

fun main(args: Array<String>) {
    val numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).toList()
    val person = Person()

//      log.debug("ast");
    val set = numbers.map { it + 1 }
    person.someNewMethod(numbers)
    var now: LocalDateTime
    val customer = Customer()
    val list = customer.rentals.stream().map { obj: Rental -> obj.daysRented }.collect(Collectors.toList())
    println(list)
    method(customer.rentals)
}

fun method(rentals: MutableList<Rental?>) {
    rentals.clear()
}

fun timeBased(dateTime: LocalDateTime) {
    println("Logic with $dateTime")
    println("asdsad")
}