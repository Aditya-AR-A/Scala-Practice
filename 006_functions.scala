def sum_(a: Int, b: Int) = {
    a + b
}

@main def main() = {
    val a: Int = 64
    val b: Int = 732
    var sum: Int = sum_(a, b)
    print(s">>> Sum of $a and $b is $sum")
}