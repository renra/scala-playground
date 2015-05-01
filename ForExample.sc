object ForExample {
  def main(args: Array[String]){
    var a = 0;
    var b = 0;
    val list = List("one", "two", "three");

    for(a <- 1 to 3){
      println("a is now: " + a);
    }

    println("***");

    for(a <- 1 until 3){
      println("a is now: " + a)
    }

    println("***")

    for(a <- 1 to 3; b <- 1 until 3){
      println("a is now: " + a)
      println("b is now: " + b)
    }

    println("***")

    for(a <- list if a == "one" || a == "two"){
      println("a is now: " + a)
    }
  }
}
