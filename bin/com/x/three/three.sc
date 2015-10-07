package com.x.three
object three {
  val b = new Book("1", "2")                      //> b  : com.x.three.Book[String,String] = com.x.three.Book@68b88d29
  print(b)                                        //> com.x.three.Book@68b88d29
  val c = new Book[String , Int]("2",1)           //> c  : com.x.three.Book[String,Int] = com.x.three.Book@38f4f222
}