object Collections {
  def main(args: Array[String]){
    val list1 = List(1, 2, 3);
    val list2 = List(4, 5, 6);

    println(list1 ++ list2);
    println(list1 :: list2);
  }
}
