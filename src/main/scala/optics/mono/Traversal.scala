package optics.mono

trait Traversal[From, To]  { self =>
  def andThen[Next](other: Traversal[To, Next]): Traversal[From, Next] = ???
}



