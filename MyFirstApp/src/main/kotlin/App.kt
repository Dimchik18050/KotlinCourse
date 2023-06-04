fun main(args: Array<String>){
    println("Pow!")

    // Commands
    var x = 3
    val name = "Cormoran"
    x = x * 10
    print("x is $x.")
    // This is comment

    // Loops
    while (x > 20){
        x = x - 1
        print(" x is now $x.")
    }
    for (i in 1..100){
        x = x + 1
        print(" x is now $x.")
    }

    // Conditions
    if (x == 20){
        println(" x must be 20.")
    } else {
        println(" x isn't 20.")
    }
    if (name.equals("Cormoran")) {
        println("$name Strike")
    }
}