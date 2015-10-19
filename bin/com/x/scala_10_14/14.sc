package com.x.scala_10_6

object go{
def smaller[T] (a:T,b:T)(implicit oder :T => Ordered[T]) = if (a < b) a else b
                                                  //> smaller: [T](a: T, b: T)(implicit oder: T => Ordered[T])T
def smaller2[T] (a:T,b:T)(implicit oder :T => Ordered[T]) = if (oder(a) < b) a else b
                                                  //> smaller2: [T](a: T, b: T)(implicit oder: T => Ordered[T])T

}