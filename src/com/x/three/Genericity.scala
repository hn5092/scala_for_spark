package com.x.three

/**
 * @author xym
 */
class Genericity[T,G] {
   
}
class Book[T, G](val t : T, c : G)
object gao extends App{
 val  b = new Book("1","2")
 print(b)
}