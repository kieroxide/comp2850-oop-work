// Task 5.2.2: conversion of marks into grades, using a function
fun main(args: Array<String>){
    val MIN_ARGUMENT_SIZE = 1;

    if(args.size < MIN_ARGUMENT_SIZE){
        println("Invalid number of arguments");
        return;
    }

    // Loop over all marks and calcs grade and prints both
    for(arg in args){
        val mark = arg.toInt();
        val grade = grade(mark);
        println("Mark: $mark -> Grade: $grade")
    }
}

fun grade(mark: Int): String {
    when (mark) {
        in 0..39   -> return "Fail"
        in 40..69  -> return "Pass"
        in 70..100 -> return "Distinction"
        else       -> return "?"
    }
}
