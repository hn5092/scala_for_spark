package com.x.scala_10_6

object g1o{
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //转换类型
def smaller[T](first : T,second : T)(implicit sorted : T =>  Ordered[T])={
	if (first < second) first else second
}                                                 //> smaller: [T](first: T, second: T)(implicit sorted: T => Ordered[T])T
smaller("A", "B")                                 //> res0: String = A
Int                                               //> res1: Int.type = object scala.Int

}