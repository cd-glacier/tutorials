object NumEnglishDictionary {
  private val dictionary = Map(1->"one", 2->"two")
  def translate(num: Option[Int]): Option[String] = {
    num.map(i => dictionary(i))
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    println(NumEnglishDictionary.translate(Some(1)))
    println(NumEnglishDictionary.translate(Some(3)))
    println(NumEnglishDictionary.translate(None))
  }
}


