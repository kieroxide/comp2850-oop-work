// Task 5.3.2: dice rolling simulation
import kotlin.random.Random

fun main(){
    val sides = readInt("Enter number of sides for the dice (default 6): ");
    val numberOfDice = readInt("Enter number of dice to throw (default 1): ");
    if(sides != null && numberOfDice != null){
        rollDice(sides, numberOfDice);
    } else if (sides != null) {
        rollDice(sides=sides);
    } else if (numberOfDice != null){
        rollDice(numberOfDice=numberOfDice);
    } else {
        rollDice();
    }
}

fun rollDice(sides: Int = 6, numberOfDice: Int = 1){
    var sum = 0;
    repeat(numberOfDice){
        sum += rollDie(sides);
    }
    println("Total Dice Score: $sum");
}

fun rollDie(sides: Int = 6): Int {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        return result;
    }
    else {
        println("Error: cannot have a $sides-sided die")
        return 0;
    }
}

fun readInt(prompt: String): Int? {
    print(prompt);
    return readln().toIntOrNull();
}