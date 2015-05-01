class Person(posX: Int, posY: Int) {
  var x: Int = posX
  var y: Int = posY

  def move(newPosX: Int, newPosY: Int){
    x = newPosX
    y = newPosY
  }

  override def toString(): String = "(" + x + ", " + y + ")"
}

object Classes extends App {
  val p = new Person(0, 0);
  p.move(0, 1);

  println("The person is at: " + p)
}
