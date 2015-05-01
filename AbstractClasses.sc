abstract class Buffer[+T] {
  val element: T
}

abstract class SeqBuffer[U, +T <: Seq[U]] extends Buffer[T] {
  def length = element.length
}

object AbstractTypesExercise2 extends App {
  def newIntSeqBuffer(elem1: Int, elem2: Int): SeqBuffer[Int, Seq[Int]] =
    new SeqBuffer[Int, List[Int]] {
      val element = List(elem1, elem2)
    }

  val buffer = newIntSeqBuffer(7, 8)

  println("Length is: " + buffer.length)
  println("Content is: " + buffer.element)
}
