object Hello {
  def main(args: Array[String]) = {
    val i = 15

    val result = if (i % 3 == 0 && i % 5 == 0){
      "Fizzbuzz"
    } else if (i % 3 == 0) {
      "Fizz"
    } else if (i % 5 == 0) {
      "Buzz"
    } else {
      i.toString
    }
    println(result)

    val msg = i match {
      case 0 | 1 => "0 or 1"
      case n if n < 100 => "under 100"
      case _ => "other number"
    }
    println(msg)
  }

  val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  val list2 = list.map { n => 
    n * n
  }.filter { n =>
    n % 2 == 0
  }.sum
  println(list2)

  val list3 = list.grouped(2).foreach { ns => println(ns) }
  val map = list.groupBy { n => if (n % 2 == 0) "even" else "odd"} 
  println(map.get("even"))

  //同値
  println(list.reduce {(x, y) => 10 * x + y})
  println(list.reduce {10 * _ + _})

  //同値
  println(List("apple", "banana", "grape").map( e => e.length ))
  println(List("apple", "banana", "grape").map(_.length ))

  val urls = Map(
    "www" -> "http://www.hatena.ne.jp",
    "b" -> "http://b.hatena.ne.jp",
    "blog" -> "http://hatenablog.com"
  )

  println(urls.get("www"))
  
  //option型から取り出す
  println(urls.get("www").getOrElse("no url"))
  println(urls.get("hoge").getOrElse("no url"))
 
  val message = urls.get("b") match {
    case Some(url) =>
      "bのurlは$url"
    case None =>
      "no url"
  }
  println(message)

  //for式
  println(for (i <- (1 to 9)) yield i * i) 
  println((1 to 9).map { i => i * i }) 

  (1 to 9).withFilter { i =>
    i % 2 == 0
  }.foreach { i =>
    print(i.toString + " ") 
  }
  println("")

  (1 to 9).foreach { i =>
    (1 to 9).foreach { j =>
      print((i*j).toString + " ")
    }
  }
  println("")

}



