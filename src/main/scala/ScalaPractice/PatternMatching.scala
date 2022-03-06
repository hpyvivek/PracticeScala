package ScalaPractice

object PatternMatching extends App{
  def matchTest(x:Int ):String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
  println(matchTest(3))
  println(matchTest(1))

  def matchPower ( x:Any):Any = x match {
    case "two" => 12
    case 3 => "Scala Rocks "
    case _ => " No Match "
  }
  println(matchPower("two"))
  println(matchPower(" two"))
  println(matchPower(3))

}
