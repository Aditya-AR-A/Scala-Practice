import scala.io.StdIn.readLine

@main def helloInteractive() = 
    println("Please Enter your name :")
    val name = readLine()
    println("Hello, " + name)