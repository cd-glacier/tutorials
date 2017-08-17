object NumEnglishDictionary {
  private val dictionary = Map(1->"one", 2->"two")
  def translate(num: Option[Int]): Option[String] = {
    num.flatMap(dictionary.get)
  }
  
  def translate2(num: Option[Int]): Option[String] = {
    num.collect{ case i if dictionary.isDefinedAt(i) => 
      dictionary.get(i).get
    }
  }

}

object Main {
  def main(args: Array[String]): Unit = {
    println(NumEnglishDictionary.translate(Some(1)))
    println(NumEnglishDictionary.translate(Some(3)))
    println(NumEnglishDictionary.translate(None))

    println(NumEnglishDictionary.translate2(Some(1)))
    println(NumEnglishDictionary.translate2(Some(3)))
    println(NumEnglishDictionary.translate2(None))
  }
}


