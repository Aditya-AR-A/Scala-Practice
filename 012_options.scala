@main def options() = {
    def getFirstElement(list: List[Int]): Option[Int] = list.headOption

    val myList = List(1, 2, 3, 4)
    val firstElement = getFirstElement(myList)

    firstElement match {
        case Some(value) => println(s"The First element is $value")
        case None => println("The list is empyty")
    }
}