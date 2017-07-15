object GetFirst {
  def getFirst(value: Option[String]): String = {
    value.getOrElse("").headOption.getOrElse("").toString
  }

  def main(args: Array[String]): Unit = {
    println(getFirst(Some("hello")))
    println(getFirst(Some("")))
    println(getFirst(None))
  }
}


