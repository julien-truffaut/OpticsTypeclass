package optics.mono

trait Optional[From, To] extends Traversal[From, To] { self =>
  def andThen[Next](other: Optional[To, Next]): Optional[From, Next] = ???
}

object Optional {
  def apply[From, To](): Optional[From, To] = new Optional[From, To] {}
}

