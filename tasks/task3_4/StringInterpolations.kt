// Task 3.4: string interpolation
fun main(){
    val SHORT_NAME_LENGTH_MAX = 5
    
    print("Enter your name: ")
    val name = readln()
    
    println("Hello $name!")
    println("Your name contains ${name.length} characters")
    println("Is it a short name? ${name.length < SHORT_NAME_LENGTH_MAX}")
    println("Uppercase name is ${name.uppercase()}")
}
