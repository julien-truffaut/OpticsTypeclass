package optics.mono

trait Index[From, -Key, To] {
  def index(key: Key): Optional[From, To]
}

object Index {
  def index[From, Key, To](key: Key)(implicit ev: Index[From, Key, To]): Optional[From, To] = ev.index(key)

  implicit def mapIndex[K, V]: Index[Map[K, V], K, V] = ???
  implicit def listIndex[A]: Index[List[A], Int, A] = ???
}

