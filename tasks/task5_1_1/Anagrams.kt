// Task 5.1.1: anagram checking using a function
fun main(){
    println("Input First word: ");
    val first = readln();
    println("\nInput Second word:");
    val second = readln();
    if(anagrams(first, second)){
        println("\n$first is an anagram of $second");
    } else {
        println("\n$first is not an anagram of $second");
    }
}

fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false;
    }
    val firstChars = first.lowercase().toList().sorted();
    val secondChars = second.lowercase().toList().sorted();
    return firstChars == secondChars;
}
