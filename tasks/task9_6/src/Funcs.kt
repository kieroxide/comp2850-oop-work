// Task 9.6: functions for dataset variance calculation
import java.io.File

// Add variance() function here
fun variance(dataset: List<Double>): Double {
    require(dataset.size > 2) {"Not enough values in list"}

    val mean = dataset.average()
    val sumSquaredDev = dataset.map { it - mean }.sumOf { it * it }
    return sumSquaredDev / (dataset.size - 1)
}

// Add readData() function here
fun readData(filename: String) = buildList {
    File(filename).forEachLine {
        val value = it.toDoubleOrNull()
        if(value != null) add(value)
    }
}