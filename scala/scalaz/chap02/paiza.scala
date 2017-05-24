object Main extends App {
  def judge(t: String, points: List[Int]): Boolean = {
    if (points.sum <= 350){
      false
    }
  
    //val major = if ...ってやったらjava.lang.Integerになる
    var major = 0
    if (t == "l") {
      major = points(3) + points(4) 
    } else if (t == "s") {
      major = points(1) + points(2) 
    }
  
    return major <= 160
  }

  judge("l", List(70, 78, 82, 57, 74))
  print(List(70, 78, 82, 57, 74))
}
