object HigherOrderFunctionsExercise extends App {
  val dbg = false

  // Just for show
  def anonymousFunctionExercise(f: () => Unit) = {
    if(dbg) println("Anonymous function caller")
    f()
  }

  // Just for show
  def doSomethingWithTwoIntegers(f: (Int, Int) => Int, a: Int, b: Int): Int = {
    if(dbg) println("Doing something with integers: " + a + " and b: " + b)
    f(a, b)
  }

  def tailRecursiveSum(f: Int => Int, lowerBound: Int, upperBound: Int): Int = {
    if(dbg) println("Tail recursive sum")

    def loop(a: Int, accummulator: Int): Int = {
      if(dbg) println("Looping with a: " + a + " accummulator: " + accummulator)

      if(a > upperBound) accummulator
      else loop(a + 1, accummulator + f(a))
    }

    loop(lowerBound, 0)
  }

  println("Sum: " + tailRecursiveSum(x => x, 1, 10))
  println("Sum of squares: " + tailRecursiveSum(x => x*x, 1, 10))
  println("Sum of cubes: " + tailRecursiveSum(x => x*x*x, 1, 10))
}

