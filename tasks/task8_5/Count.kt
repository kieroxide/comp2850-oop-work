fun main(){
    println("Enter phrase for char count")
    val word = readln()
    while (true){
        println("Enter char for count")
        val charToCheck = readln().get(0)
        var count = word.howMany({it == charToCheck})
        println("Count of $charToCheck: $count")
        count = word.howMany() {it == charToCheck}
        println("Count of $charToCheck: $count")
        count = word.howMany {it == charToCheck}
        println("Count of $charToCheck: $count")
        count = word.filter {it == charToCheck}.length
        println("Count of $charToCheck: $count")
        count = word.count {it == charToCheck}
        println("Count of $charToCheck: $count")
    }
}

fun String.howMany(include: (Char) -> Boolean): Int {
    var count = 0
    for (character in this) {
        if (include(character)) {
            count += 1
        }
    }
    return count
}