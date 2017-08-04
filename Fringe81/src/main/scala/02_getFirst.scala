object GetFirst {
  def getFirst(value: Option[String]): String = {
    //から文字返してくれるのありがたい...
    value.map(_.take(1).toString).getOrElse("")
  }

  def main(args: Array[String]): Unit = {
    println(getFirst(Some("hello")))
    println(getFirst(Some("")))
    println(getFirst(None))
  }
}


