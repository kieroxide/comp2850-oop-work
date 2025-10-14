// Task 12.5.2: class with a custom getter

import java.time.LocalDate
class Person(_name: String, val birth: LocalDate) {

    var isMarried = false

    var name = _name
        get() {
            return field.uppercase()
        }
}

fun main(){
    val point = Person("Kieran", LocalDate.parse("2021-01-01"))
    println(point)
    println(point.name)
}