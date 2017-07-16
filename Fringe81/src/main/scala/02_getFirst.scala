object GetFirst {
  def getFirst(value: Option[String]): String = {
    // Optionにつつまれている時はgetで取り出してから使う必要があると思い込んでいました...
    value.headOption.getOrElse("").toString
  }

  def main(args: Array[String]): Unit = {
    println(getFirst(Some("hello")))
    println(getFirst(Some("")))
    println(getFirst(None))
  }
}


