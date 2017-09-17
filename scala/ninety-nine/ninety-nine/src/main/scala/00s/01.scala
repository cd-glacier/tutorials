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

  def nth(n: Int,list: List[Int]): Int = {
    list(n)
  }

  def length(list: List[Int]): Int= {
    list.length
  }

  def reverse(list: List[Int]): List[Int] = {
    list.reverse
  }

  def palindrome(list: List[Int]): Boolean = {
    list.reverse == list
  }

  def main(args: Array[String]): Unit = {
    val list = List(0, 1, 2, 3)

    println(last(list))
    println(penultimate(list))
    println(nth(2, list))
    println(length(list))
    println(reverse(list))
    println(palindrome(List(3, 2, 1, 2, 3)))
  }
}
