// Task 12.4.1: Circle class
import kotlin.math.PI

class Circle(val center: Point, val radius: Double){
    constructor(center: Point, radius: Int): this(center, radius.toDouble())
    init {
        require(radius > 0) {"Invalid Radius Size"}
    }
    fun circumference() = 2 * radius * PI
    fun area() = PI * radius * radius
    infix fun contains(point: Point) =  center.distanceTo(point) < radius
}