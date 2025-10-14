import kotlin.math.hypot

class Point(var x: Double, var y: Double){
    fun distance() = hypot(x, y)
}

fun main(){
    val point = Point(3.toDouble(), 4.toDouble())
    println(point.x)
    println(point.y)
    println(point.distance())
}