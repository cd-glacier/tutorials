object Show {
  
  def show(value: Option[String]): Unit = {
    value.foreach(println)
  }

  def main(args: Array[String]): Unit = {
    show(Some("hoge"))
    show(None)
  }
}


