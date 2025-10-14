// Task 8.3: functions for temperature analysis

typealias Record = Pair<String,Double>

fun fetchData(): List<Record> {
    val list = listOf("a" to 1.2, "b" to 3.2, "c" to 4.4)
    return list
}

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!

fun averageTemp(data: List<Record>): Double {
    return data.sumOf {it.second} / data.size
}