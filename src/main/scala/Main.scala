import optics.mono._

object Main {

  def main(args: Array[String]): Unit = {
     val list: Optional[Int, List[String]] = Optional()
     val map: Optional[Int, Map[String, Int]] = Optional()

     list.andThen(Index.index(2): Optional[List[String], String])
     list.andThenOptional(Index.index(2))
     list.andThen(Index.index(2)) // does not compile

     map.andThen(Index.index("foo"))
  }

}
