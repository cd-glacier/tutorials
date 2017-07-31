object GetFirst {
  def getFirst(value: Option[String]): String = {
    value.map{ v => 
      if (v.isEmpty) {
        ""
      } else {
        v.head.toString
      }
    }.getOrElse("")
  }

  def main(args: Array[String]): Unit = {
    println(getFirst(Some("hello")))
    println(getFirst(Some("")))
    println(getFirst(None))
  }
}


