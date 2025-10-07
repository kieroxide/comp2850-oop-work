// Task 5.2.1: geometric properties of circles
import kotlin.math.PI

fun main(){
    val radius = readDouble("Enter radius of the circle: ");
    val area = circleArea(radius);
    val circum = circleCircumference(radius);
    println("Circle of radius %.4f".format(radius) + " has area: %.4f".format(area) +  " and circum %.4f".format(circum));
}

fun circleArea(radius: Double) = PI * radius * radius;
fun circleCircumference(radius: Double) = PI * radius * 2;
fun readDouble(prompt: String): Double{
    print(prompt);
    return readln().toDouble();
}
