@main def super_filter() = {
    var nums = (for (number <- 1 to 100) yield number).toList
    var odd_nums = nums.filter(_ % 2 != 0)
    println(odd_nums)
}