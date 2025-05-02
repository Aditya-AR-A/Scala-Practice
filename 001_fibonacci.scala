// Write a function to compute the nth Fibonacci number
object  Fibonacci {
    def fibonacci(number: Int): Int = {
        var num1: Int = 0
        var num2: Int = 1
        var count: Int = 0
        var temp: Int = 0
        while (count < number) {
            temp = num2
            num2 += num1
            num1 = temp
            count += 1
        }
        num1
    } 
}

@main def main() = {
    val fib = Fibonacci
    val num: Int = 10
    val out: Int = fib.fibonacci(num)
    println(s">>> The fibbonacci number at $num is $out")
}