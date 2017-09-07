def factorial(n: Int): Int = {
  @annotation.tailrec
  def go(n: Int, acc: Int): Int =
    if(n <= 0) acc
    else go(n-1, n*acc)
    go(n, 1)
}


def fib(n: Int): Int = {
  @annotation.tailrec
  def go(a: Int, b: Int, n: Int): Int =
    if (n == 0) a
    else if (n <= 1) b
    else go(b, a+b, n-1)
    go(0, 1, n)
}

println(fib(5))
