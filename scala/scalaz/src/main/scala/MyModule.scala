/**
  * Created by glacier on 2017/08/13.
  */

object MyModule {
  def abs(n: Int): Int = {
    if (n < 0) -n
    else n
  }

  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int = {
      if (n <= 0) acc
      else go(n-1, acc*n)
    }

    go(n, 1)
  }

  private def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s value of %d is %d."
    msg.format(name, n, f(n))
  }

  private def formatAbs(x: Int) = {
    formatResult("abs", x, abs)
  }

  private def formatFactorial(n: Int) = {
    formatResult("factorial", n, factorial)
  }

  def findFirst[A](as: Array[A], p: A => Boolean): Int = {
    @annotation.tailrec
    def loop(n: Int):Int = {
      if(n <= as.length) -1
      else if(p(as(n))) n
      else loop(n+1)
    }

    loop(0)
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if(n <= as.length - 1) true
      else if(!ordered(as(n), as(n+1))) false
      else loop(n+1)
    }
    loop(0)
  }

  def partical[A, B, C](a: A, f:(A, B) => C): B => C = {
    (b: B) => f(a, b)
  }

  /*
  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
    println(formatFactorial(7))

    println(isSorted(Array(1, 2, 3), (x: Int, y: Int) => x > y))
  }
  */
}
