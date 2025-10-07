// Task 5.1.2: die rolling simulation
import kotlin.random.Random

fun main(){
    val sides = readInt("Enter number of sides for the dice: ");
    if(sides != null) rollDie(sides)
    else println("Invalid Input")
}

fun rollDie(sides: Int) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun readInt(prompt: String): Int? {
    print(prompt);
    return readln().toIntOrNull();
}