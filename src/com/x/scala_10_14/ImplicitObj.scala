package com.x.scala_10_14

/**
 * @author xym
 */
class ImplicitObj {
  
}
abstract class Template[A]{
    def add(x : A, y : A) : A
}
abstract class SubTemplate[A] extends Template[A]{
  def unit:A
}
object a extends App{
  implicit object StringAdd extends SubTemplate[String]{
    def add(x : String, y :String) : String = x concat y
    def unit : String = ""
  }
  implicit object IntAdd extends SubTemplate[Int]{
    def add(x : Int, y : Int) : Int = x + y
    def unit : Int = 0
  }
  def sum[A](xs : List[A])(implicit m :SubTemplate[A]) : A = 
    if (xs.isEmpty) m.unit
    else m.add(xs.head,sum(xs.tail))
    println(sum(List(1,2,3)))
    print(sum(List("2","3","1")))
}