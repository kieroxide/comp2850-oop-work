// Task 12.4.2: Point class with overridden toString()

import kotlin.math.hypot

class Point(val x: Double, val y: Double) {
    fun distance() = hypot(x, y)
    fun distanceTo(p: Point) = hypot(x - p.x, y - p.y)
    override fun toString() = "($x, $y)"
}

fun main(){
    val point = Point(1.0, 2.3)
    println(point)
}
