// わかっていること
// Mapのget methodはOption型で返す
// mOptで返ってくるのではOption(Map[Int, String])
// mOpt.get(1)で使っているgetはOptionのgetである(3とかいれるとNoSuchElementExceptionが返ってくる)

object NotCompileError {
  def main(args: Array[String]): Unit = {
    val m = Map(1->"one", 2->"two")
    val mOpt: Option[Map[Int, String]] = Some(m)
    
    println(mOpt.get.get(1).get)  // これの省略...?
    println(mOpt.get(1))  // return one
  }
}


