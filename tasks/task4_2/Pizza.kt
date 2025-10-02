fun main(){
    val PIZZA_OPTIONS = 'a'.rangeTo('d');

    println("Please choose a pizza Options\na) Cheese\nb) Pepperoni\nc) Ham\nd) Donner");
    val option = readln().lowercase();
    
    if(option.length == 1 && option[0] in PIZZA_OPTIONS){
        println("Order accepted");
    } else {
        println("Invalid choice!");
    }
} 