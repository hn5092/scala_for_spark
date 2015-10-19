package com.x.scala_10_14


/**
 * @author xym
 */
//p1指定了类, 
class Pair[T : Ordering](val first: T, val second: T) {
  //类的在前面
  def smaller(implicit order: Ordering[T]) = {
    println(order.compare(first, second)); //-1
    if (order.compare(first, second) < 0) first else second
  }
}
class Pair2[T](val first: T, val second: T) {
  //类的在前面
  def smaller(implicit order: Ordering[T]) = {
    println(order.compare(first, second)); //-1
    if (order.compare(first, second) < 0) first else second
  }
}
trait Word3 {
}
class Word1(var length : Int) {
  override def toString = "" + length
}
class Word11(length : Int, val length2 :String) extends Word1(length){
    override def toString = ""+length2
}
class Word2 (val length2 : String){
  override def toString = "" + length2
}
trait WordOrdering extends Ordering[Word1]{
   override def compare(first : Word1, second : Word1)={
     if (first.toString().length() <= first.toString().length()) -1 else 0
   }
}
trait WordOrdering2 extends Ordering[Word2]{
   override def compare(first : Word2, second : Word2)={
     if (first.toString().length() <= first.toString().length()) -1 else 0
   }
}
trait WordOrdering11 extends Ordering[Word11]{
   override def compare(first : Word11, second : Word11)={
     if (first.toString().length() <= first.toString().length()) -1 else 0
   }
}
object ContextBound {
  //方法的 上下文边界是 =>
  def smaller2[T] (a:T,b:T)(implicit oder :T => Ordered[T]) = if (oder(a) < b) a else b

  def main(args: Array[String]): Unit = {
    val pair1 = new Pair(2, 3);
    println(pair1.smaller);
    println(smaller2(1, 2));
    implicit object Word1 extends WordOrdering 
    implicit object Word11 extends WordOrdering11 
    val pair2 = new Pair(new Word11(1,"2"), new Word11(2,"33"))//  错误的,因为不属于类orderding
    implicit object Word2 extends WordOrdering2  //隐式转换继承
    val pair3 = new Pair(new Word2("spark"), new Word2("small")) //此时错误没了  已经转换成了
//    println(pair2.smaller)
  }
}
