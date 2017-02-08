import scala.io.Source
if (args.length > 0) {
  val lines = Source.fromFile(args(0)).getLines().toList
  def widthOfLength(s: String): Int = s.length.toString.length
  def maxWidth(li: List[String]): Int = li.map(e => widthOfLength(e)).max
  def niceLength(maxWidth: Int, s: String): String = " " * (maxWidth - widthOfLength(s))
  val max = maxWidth(lines)
  lines.map{ line =>
    println(line.length + niceLength(max, line) + " | " + line)
  }
} else {
  Console.err.println("Please enter filename\n")
}

