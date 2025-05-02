object GeometryUtils {
    var pi: Double = 3.14
    
    def areaOfCircle(radius: Double) = pi * radius * radius

    def circumferenceOfCircle(radius: Double) = 2 * pi * radius
}

@main def check() = {
    var radius: Double = 7
    var area = GeometryUtils.areaOfCircle(radius)
    var circum = GeometryUtils.circumferenceOfCircle(radius)

    println(s">>> The radius of the circle is $radius")
    println(s">>> The area of the circle is $area")
    println(s">>> The circumference of the circle is $circum")
}