object CurryingExercise extends App {
  def operate
    (
      incrementFunction: Int => Int,
      comparingFunction: (Int, Int) => Boolean,
      accummulationFunction: (Int, Int) => Int,
      projectionFunction: Int => Int
    )(
      lowerBound: Int,
      upperBound: Int,
      initialValue: Int
    ): Int =
  {

    //tail recursive loop
    def loop(a: Int, accummulator: Int): Int = {
      if(comparingFunction(a, upperBound)) accummulator
      else accummulationFunction(
        projectionFunction(a),
        loop(incrementFunction(a), accummulator)
      )
    }

    loop(lowerBound, initialValue)
  }

  def addingOneOnIncrement
    (
      accummulationFunction: (Int, Int) => Int,
      projectionFunction: Int => Int
    )
    (
      lowerBound: Int,
      upperBound: Int,
      initialValue: Int
    ): Int =
  {
    operate(
        x => x+1,
        (x,y) => x > y,
        accummulationFunction,
        projectionFunction
      )(
        lowerBound,
        upperBound,
        initialValue
      )
  }

  def sum
    (
      projectionFunction: Int => Int
    )(
      lowerBound: Int,
      upperBound: Int
    ): Int =
  {
    addingOneOnIncrement(
        (x,y) => x+y,
        projectionFunction
      )(
        lowerBound,
        upperBound,
        0
      )
  }

  def product
    (
      projectionFunction: Int => Int
    )(
      lowerBound: Int,
      upperBound: Int
    ): Int =
  {
    addingOneOnIncrement(
        (x,y) => x*y,
        projectionFunction
      )(
        lowerBound,
        upperBound,
        1
      )
  }

  println(product(x=>x)(10, 10))
  println(product(x=>x*x)(10, 10))

  println(sum(x=>x)(-5, 5))
  println(sum(x=>x*x)(0, 10))
}
