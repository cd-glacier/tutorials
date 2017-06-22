object Main {
  
  def show(value: Option[String]): Unit = {
    value match {
      case Some(v) => println(v)
      case None => 
    }
  }

  def main(args: Array[String]): Unit = {
    show(Some("hoge"))
    show(None)
  }
}


