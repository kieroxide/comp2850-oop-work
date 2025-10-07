// Task 7.7.2: contact database, using a map
fun main(){
    val map = mutableMapOf<String, String>();
    while (true){
        println("Enter Contact's Name: ")
        val contact = readln();
        val mapResponse = map.getOrElse(contact) {null};
        if(mapResponse != null){
            println("Phone Number: $mapResponse");
        } else {
            println("Phone Number Not Found.\nEnter Phone Number for Contact: ")
            map[contact] = readln()
        }
    }
}