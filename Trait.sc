//trait Buffer {
//  type T
//  val element: T
//}
//
//trait SeqBuffer extends Buffer {
//  type U
//  type T <: Seq[U]
//  def length = element.length
//}
//
//abstract class IntSeqBuffer extends SeqBuffer {
//  type U = Int
//}

object AbstractTypesExercise extends App {
  //def newIntSeqBuffer(elem1: Int, elem2: Int): IntSeqBuffer =
  //  new IntSeqBuffer {
  //    type T = List[U]
  //    val element = List(elem1, elem2)
  //  }

  //val buffer = newIntSeqBuffer(7, 8)

  //println("Length is: " + buffer.length)
  //println("Content is: " + buffer.element)
}
