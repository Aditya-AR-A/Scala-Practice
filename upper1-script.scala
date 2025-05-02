// Making a script to make all the characters UPPER case




class Upper {
  def upper(strings: String*): Seq[String] = strings.map(_.toUpperCase)
}

@main def runUpper(): Unit = {
  val up = new Upper
  val result = up.upper("A", "First", "Scala", "Program")
  println(result)
}
