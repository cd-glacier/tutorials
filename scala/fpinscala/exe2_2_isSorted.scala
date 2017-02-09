def findFirst[A](as: Array[A], p: A => Boolean): Int = {
  @annotation.tailrec
  def loop(n: Int): Int =
    if(n >= as.length) -1
    else if (p(as(n))) n
    else loop(n + 1)
  loop(0)
}

val a = Array("foo", "fuga", "hoge")
println(findFirst(a, (s: String) => s == "hoge"))


def isSorted[A](as: Array[A], p: (A, A) => Boolean): Boolean = {
  @annotation.tailrec
  def loop(n: Int): Boolean = {
    if (n >= as.length-1) true
    else if (p(as(n), as(n+1))) false
    else loop(n+1)
  }
  loop(0)
}

val b = Array(1, 2, 3, 4)
println(isSorted(b, (a: Int, b: Int) => a >= b))
