// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    require(args.size == 1) {"Invalid Command Line Argument"}
    val result = runCatching {readData("data/" + args[0])}
    if(result.isFailure){
        println("Error Occured While Reading File: ${result.exceptionOrNull()}")
        exitProcess(-1)
    }
    val data = result.getOrThrow()
    val vari = variance(data)
    println("Variance of dataset: $vari")
}
