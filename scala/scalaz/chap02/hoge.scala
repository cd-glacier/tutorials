object Main extends App {
  def printShape(x: Int): Unit = {
    if (x <= 0){
      return
    }
    print("*")
    printShape(x - 1)
  }

  printShape(args(0).toInt)
}

