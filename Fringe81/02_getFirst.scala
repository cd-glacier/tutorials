object Main {

  def getFirst(value: Option[String]): String = {
    value match {
      case Some(s) => if (s.isEmpty) "" else s.head.toString
      case None => ""
    }
  }

  def main(args: Array[String]): Unit = {
    println(getFirst(Some("hello")))
    println(getFirst(Some("")))
    println(getFirst(None))
  }
}


