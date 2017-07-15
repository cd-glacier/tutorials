object Show {
  
  def show(value: Option[String]): Unit = {
    value.map(println(_))
  }

  def main(args: Array[String]): Unit = {
    show(Some("hoge"))
    show(None)
  }
}


