// Task 7.7.1: stats for a numeric dataset


fun main(){
    val data = readData();
    data.printStats();
}

fun List<Double>.printStats() {
    println("Max: ${this.min}")
    println("Max: ${this.max}")
    println("Median: ${this.median}")
    println("Mean: ${this.mean}")
}

fun readData(): List<Double> = buildList {
    println("Enter a number to add to the list. Enter a non-number to display median of list")
    while (true){
        val input = readln().toDoubleOrNull();
        if(input != null)  add(input);
        else break;
    }
}

val List<Double>.max: Double get() = this.max();

val List<Double>.min: Double get() = this.min();

val List<Double>.mean: Double get() {
    var sum = 0.0;
    for(num in this){
        sum += num;
    }
    return sum / this.size;
}

val List<Double>.median: Double get() { 
    val dataSorted = this.sorted()
    val length = dataSorted.size

    if(length % 2 == 0){
        // Even Number of items
        val halfIndex = (length / 2) - 1;
        val medianPartA = this.get(halfIndex);
        val medianPartB = this.get(halfIndex + 1);
        return (medianPartA + medianPartB) / 2
    } else {
        // Odd number of items
        val medianIndex = (length / 2); // truncates 1 less if odd so no need to - 1
        return dataSorted.get(medianIndex);
    }
}