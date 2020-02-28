import optics.mono._

object Main {

  def main(args: Array[String]): Unit = {
     val list: Optional[Int, List[String]] = Optional()
     val map: Optional[Int, Map[String, Int]] = Optional()

     list.andThen(Index1.index(2))
     map.andThen(Index1.index("foo"))

     list.andThen(Index2.index(2))
     map.andThen(Index2.index("foo"))
  }

}
