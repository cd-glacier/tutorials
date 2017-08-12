object PassStudents {

  def haveEnglishAndMath(m: Map[String, Int]): Boolean = {
    m.isDefinedAt("math") && m.isDefinedAt("english")
  }

  def passStudents(scores: Map[String, Map[String, Int]]): Map[String, Int] = {
    scores.filter{ case (_, score) =>
      haveEnglishAndMath(score) && (score("math") + score("english")) / 2 >= 80
    }.map{ case (name, score) =>
      name -> (score("math") + score("english")) / 2
    }
  }

  def passStudents2(scores: Map[String, Map[String, Int]]): Map[String, Int] = {
    scores.flatMap{ case (name, score) =>
      if (haveEnglishAndMath(score)) Some(name -> score) else None
    }.flatMap { case (name, score) =>
      if ((score("math") + score("english")) / 2 >= 80){
        Some(name -> (score("math") + score("english")) / 2)
      } else {
        None
      } 
    }.flatMap{ case (name, ave) =>
      Map(name -> ave)
    }
  }

  /*
  def passStudents3(scores: Map[String, Map[String, Int]]): Map[String, Int] = {
    scores.collect { info => 
      info match {
        case haveEnglishAndMath(info.score) && (info.score("math") + info.score("english")) / 2 >= 80 => 
          info.name -> (info.score("math") + info.score("english")) / 2
      }
    }
  }
  */
 
  def main(args: Array[String]): Unit = {
    val scores = Map(
      "ichiro" -> Map("math"->82, "english"->99),
      "jiro" -> Map("japanese"->100, "social"->88),
      "saburo" -> Map("math"->76, "english"->80),
      "shiro" -> Map("math"->99, "social"->81),
      "hanako" -> Map("math"->84, "english"->78, "social"->66))

    println(passStudents(scores))
    println(passStudents2(scores))
    //println(passStudents3(scores))
  }
}


