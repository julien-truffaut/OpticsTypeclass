package optics.mono

trait Index2[From, -Key] {
  type To

  def index(key: Key): Optional[From, To]

}

object Index2 {
  type Aux[From, Key, _To] = Index2[From, Key] { type To = _To }

  def index[From, Key](key: Key)(implicit ev: Index2[From, Key]): Optional[From, ev.To] = ev.index(key)

  implicit def mapIndex[K, V]: Aux[Map[K, V], K, V] = new Index2[Map[K, V], K]  {
    type To = V
    def index(key: K): Optional[Map[K, V], V] = Optional()
  }

  implicit def listIndex[A]: Aux[List[A], Int, A] = new Index2[List[A], Int] {
    type To = A

    def index(key: Int): Optional[List[A], A] = Optional()
  }
}




