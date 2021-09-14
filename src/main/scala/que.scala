class que extends fibonacci {

  def divide(x : Int,y : Int): Int = x/y
}

object myclass {
  def main(args: Array[String]): Unit = {

    val obj = new que
    obj.fib(6)
    obj.divide(10,2)
  }
}