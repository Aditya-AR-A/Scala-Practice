@main def maps() = {
    var myMap = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(s">>> myMap = $myMap")
    
    myMap += "d" -> 4
    println(s">>> myMap = $myMap")
    
    myMap = myMap.updated("b", 64)
    println(myMap("b"))
    
    myMap -= "a"
    println(s">>> myMap = $myMap")

}

