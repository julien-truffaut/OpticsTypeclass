package optics.mono

trait Optional[From, To] {
  // non-overloaded andThen
  def andThenOptional[Next](other: Optional[To, Next]): Optional[From, Next] = ???

  def andThen[Next](other: Optional[To, Next]): Optional[From, Next] = ???
  def andThen[Next](other: Traversal[To, Next]): Traversal[From, Next] = ???
}

object Optional {
  def apply[From, To](): Optional[From, To] = new Optional[From, To] {}
}

