import kotlin.math.roundToInt as roundToInt

// Task 3.4: string interpolation
fun main(args: Array<String>){
    val ARGUMENT_SIZE = 3;

    if(args.size != ARGUMENT_SIZE){
        println("Invalid number of arguments");
        return;
    }

    // Calculate sum and divide by Arg size to get avg
    var sum = 0;
    for(arg in args){
        sum += arg.toInt()
    }

    // Round to avoid truncation error
    val average = (sum.toDouble() / ARGUMENT_SIZE).roundToInt()
    
    // Selects grade and prints it
    val grade = when (average) {
        in 0..39 -> "Fail"
        in 40..69 -> "Pass"
        in 70..100 -> "Distinction"
        else -> "ERROR"
    }

    println(grade)
}
