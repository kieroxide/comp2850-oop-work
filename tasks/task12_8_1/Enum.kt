// Task 12.8.1: example of an enum class
enum class Day {
    Monday, Tuesday, Wednesday, Thursday,
    Friday, Saturday, Sunday
}

fun main(){
    print("Enter a day of the week || Options: ")
    for (entry in Day.entries){
        print("${entry.name} ")
    }
    println()
    val day = readln().replaceFirstChar {it.uppercase()}
    try{
        val dayParsed = Day.valueOf(day)
        println("Entered $dayParsed")
    }
    catch(e: IllegalArgumentException){
        println("Invalid Input. Try Again")
    }
}