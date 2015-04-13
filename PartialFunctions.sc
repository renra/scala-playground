object PartialFunctions {
  def main(args: Array[String]) {
    val f: PartialFunction[String, String] = { case "one" => "uno"  }

    println("Is defined at one: " + f.isDefinedAt("one"))
    println("Is defined at two: " + f.isDefinedAt("two"))
  }

}
