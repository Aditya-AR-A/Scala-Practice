// Create a class Rectangle with methods to calculate area and perimeter.

class Rectangle(val len: Int, val bred:Int) {
    require(len > 0 && bred > 0, "Length and breadth must be positive")

    def area(): Int = len * bred
    def perimeter(): Int = 2 * (len + bred)
}

@main def main() = {
    val rect = Rectangle(10, 20)
    val rect_area: Int = rect.area()
    val rect_peri: Int = rect.perimeter()

    println(s">>> The area of the rectangle is $rect_area") 
    println(s">>> The perimeter of the rectangle is $rect_peri") 
}
