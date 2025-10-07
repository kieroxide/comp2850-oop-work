// Task 5.1.1: anagram checking using a function
fun main(){
    println("Input First word: ");
    val first = readln();
    println("\nInput Second word:");
    val second = readln();
    if(first anagramOf second){
        println("\n$first is an anagram of $second");
    } else {
        println("\n$first is not an anagram of $second");
    }
}

infix fun String.anagramOf(str: String): Boolean {
    if (this.length != str.length) {
        return false;
    }
    val firstChars = this.lowercase().toList().sorted();
    val secondChars = str.lowercase().toList().sorted();
    return firstChars == secondChars;
}
