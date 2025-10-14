// Task 12.4.1: main program

fun main() {
    val pointA = Point(11, 0)
    val circle = Circle(Point(0,0), 10)
    println(circle.circumference())
    println(circle.area())
    println(circle contains pointA)
}
