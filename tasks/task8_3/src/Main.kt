// Task 8.3: weather station temperature analysis program

fun main() {
    val data = fetchData()
    println("""Data: $data
    Minimum Temp: ${data.minBy {it.second}}
    Maximum Temp: ${data.maxBy {it.second}}
    Minimum Temp: ${averageTemp(data)}""")
}
