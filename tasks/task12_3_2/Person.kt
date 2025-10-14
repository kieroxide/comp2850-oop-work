// Task 12.3.2: Person class, with a secondary constructor
import java.time.LocalDate

class Person(var name: String, val birth: String) {
    constructor(name: String, birth: LocalDate): this(name, birth.toString())
    var isMarried = false
}

fun main(){
    val date = LocalDate.of(1, 8, 23)
    val person = Person("Kieran", date)
    println(person.name)
    println(person.birth)
    println(person.isMarried)
    val person2 = Person("Morgan", "2023-01-01")
    println(person2.name)
    println(person2.birth)
    println(person2.isMarried)
}