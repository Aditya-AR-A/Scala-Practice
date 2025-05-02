@main def list_creation() = {
    var list_type1 = List(1 to 100).flatten
    println(s">>> List Printed Using List(1 to 100, 1) \n... $list_type1")
    var list_type2 = (1 to 100).toList
    println(s">>> List Printed Using (1 to 100).toList \n... $list_type2")
}