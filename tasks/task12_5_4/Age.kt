// Task 12.5.4: class with a computed property

import java.time.LocalDate
import java.time.temporal.ChronoUnit.YEARS

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false
    val age get() = YEARS.between(birth, LocalDate.now()).toInt()
}

fun main(){
    val person = Person("Kieran", LocalDate.parse("0500-01-05"))
    println(person.age)
}