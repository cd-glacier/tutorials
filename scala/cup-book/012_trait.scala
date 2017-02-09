// クラスとトレイトの違い
// 引数を取れない


trait Philosophical {
  def philosophize() = {
    println("I consume memory, therefore I am!")
  }
}

class Animal
class Frog extends Animal with Philosophical {
  override def toString = "green"
  override def philosophize() = {
    println("It ain't easy being " + toString + "!")
  }
}

val frog = new Frog
println(frog.toString)
println(frog.philosophize)

val phil: Philosophical = frog
println(phil.toString)
println(phil.philosophize)



