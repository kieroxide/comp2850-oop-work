// Task 12.3.2: Person class, with a secondary constructor
import java.time.LocalDate

class Person(var name: String, val birth: String) {
    constructor(name: String, birth: LocalDate): this(name, birth.toString())
    init {
        require(name.isNotBlank()) { "Name cannot be blank" }
    }
    var isMarried = false
}

fun main(){
    println("Name: ")
    val name = readln()
    println("DOB: ")
    val dob = readln()
    val person = Person(name, dob)
}