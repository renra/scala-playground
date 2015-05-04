class Person(posX: Int, posY: Int) {
  var x: Int = posX
  var y: Int = posY

  def move(newPosX: Int, newPosY: Int){
    x = newPosX
    y = newPosY
  }

  override def toString(): String = "(" + x + ", " + y + ")"
}

class Rational(_nominator: Int, _denominator: Int){
  def nominator = _nominator
  def denominator = _denominator

  def add(operand: Rational): Rational = {
    new Rational(
      nominator * operand.denominator + operand.nominator * denominator,
      denominator * operand.denominator
    )
  }

  def subtract(operand: Rational): Rational = {
    add(operand.neg())
  }

  def neg(): Rational = {
    new Rational(-nominator, denominator)
  }

  override def toString(): String = nominator + "/" + denominator
}

object Classes extends App {
  //val p = new Person(0, 0);
  //p.move(0, 1);

  //println("The person is at: " + p)
  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)

  val result = x.subtract(y).subtract(z)

  println(result)
}
