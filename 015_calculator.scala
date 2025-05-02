object Calculator {
    def add(a: Int, b: Int) = {
        var sum: Int = a + b
        println(sum)
    }
}

@main def test() = {
    var calc = Calculator
    calc.add(90, 74)
}