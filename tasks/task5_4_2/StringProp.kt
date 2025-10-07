// Task 5.4.1: string extension function
val String.tooLong: Boolean get() =  this.length > 20

fun main(){
    print("Enter a string: ");
    val str: String = readln();
    print("It is ${str.tooLong} that this string is too long");
}