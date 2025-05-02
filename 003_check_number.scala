@main def check_number() = {
    var random_number: Int = -45

    if (random_number > 0) {
        println(">>> The Numebr is positive")
    } else if (random_number < 0) {
        println(">>> The Number is negative")
    } else {
        println(">>> The number is zero")
    }
}   