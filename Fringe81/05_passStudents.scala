object Main {

  def haveEnglishAndMath(m: Map[String, Int]): Boolean = {
    m.isDefinedAt("math") && m.isDefinedAt("english")
  }

  def passStudents(scores: Map[String, Map[String, Int]]): collection.mutable.Map[String, Int] = {
    val result = collection.mutable.Map.empty[String, Int]
    scores.foreach{ case (name, score) =>
      val average = if (haveEnglishAndMath(score)) {
        (score("math")+score("english")) / 2
      } else {
        0
      }
      if (haveEnglishAndMath(score) && average >= 80) {
        result += name -> average
      }
    }
    return result
  }

  def main(args: Array[String]): Unit = {
    val scores = Map(
      "ichiro" -> Map("math"->82, "english"->99),
      "jiro" -> Map("japanese"->100, "social"->88),
      "saburo" -> Map("math"->76, "english"->80),
      "shiro" -> Map("math"->99, "social"->81),
      "hanako" -> Map("math"->84, "english"->78, "social"->66))

    println(passStudents(scores))
  }
}


