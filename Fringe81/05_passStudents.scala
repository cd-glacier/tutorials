object Main {

  def haveEnglishAndMath(m: Map[String, Int]): Boolean = {
    m.isDefinedAt("math") && m.isDefinedAt("english")
  }

  def passStudents(scores: Map[String, Map[String, Int]]): Map[String, Int] = {
    val result: Map[String, Map[String, Int]]
    scores.foreach{ case (k, v) => 
      if (haveEnglishAndMath(v)) {
        if ((v("english") + v("math") / 2) >= 80){
          result += k -> v
        }
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


