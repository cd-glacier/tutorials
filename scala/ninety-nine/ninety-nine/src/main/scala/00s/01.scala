package zero

object Zeros {

  def last(list: List[Int]): Int = {
    list.last
  }

  def penultimate(list: List[Int]): Int = list match {
    case x :: Nil => x
    case x :: xs => penultimate(xs)
    case _ => throw new NoSuchElementException("list is empty")
  }


  def main(args: Array[String]): Unit = {
    val list = List(0, 1, 2, 3)

    println(last(list))
    println(penultimate(list))
  }
}
