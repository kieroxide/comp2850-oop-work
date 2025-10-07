import kotlin.ULong
// Task 4.5: summing odd integers with a for loop

fun main(){
    val MAXIMUM_LIMIT = 1_000_000uL;
    println("Enter a postive integer limit to oddSum with max limit of 1,000,000");

    // Uses unsigned long for large possible number size
    val limit = readln().toULongOrNull();
    
    if (limit == null || limit > MAXIMUM_LIMIT) {
        println("Invalid Limit entered")
        return;
    }

    // Loop through all odd numbers from 1 to limit
    var sum = 0uL;
    for(x in 1uL..limit step 2L){
        sum += x;
    }

    println("Sum Of odd numbers from 1 to $limit := $sum");
}