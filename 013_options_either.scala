def divide(x: Int, y: Int): Either[String, Int] = {
    if(y == 0) Left("Cannot Divide by Zero")
    else Right(x / y)
}

@main def eitherExample() = {
    val result = divide(10, 0)

    result match {
        case Left(error) => println(s"Failed $error")
        case Right(value) => println(s"Success $value")
    }

}