object GetFirst {
  def getFirst(value: Option[String]): String = {
    if (value.isDefined) {
      value.head.toString
    } else {
      ""
    }
  }

  def main(args: Array[String]): Unit = {
    println(getFirst(Some("hello")))
    println(getFirst(Some("")))
    println(getFirst(None))
  }
}


