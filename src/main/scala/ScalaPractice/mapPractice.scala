package ScalaPractice

object mapPractice extends App{
 val colors:Map[String, String]= Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")

 if( colors.contains( "red" )) {
  println("Red key exists with value :"  + colors("red"))
 } else {
  println("Red key does not exist")
 }




















}
