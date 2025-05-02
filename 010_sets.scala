@main def sets() = {
    var mySet = Set(1, 2, 3, 4, 5, 4)
    println(s">>> My Set is $mySet")

    // Adding an element 
    mySet += 7
    println(s">>> My Updated set \n ... $mySet")
    
    // Removing an element 
    mySet -= 5
    println(s">>> My Updated set \n ... $mySet")
    
    // Checking for membership
    val isMember = mySet(3)
    println(s"Is 3 a member of the set? $isMember")
}