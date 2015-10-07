package com.x.one

import scala.collection.mutable.SortedSet

object operation {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val s = Set(1, 2, 3, 4, 5)                      //> s  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
  s - 5                                           //> res0: scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)
  s - (1, 2, 3)                                   //> res1: scala.collection.immutable.Set[Int] = Set(5, 4)
  s + 6                                           //> res2: scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 3, 4)
  s + 1                                           //> res3: scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
  //排序的Set 不可变的
  var sortS = SortedSet(1, 2, 3, 4)               //> sortS  : scala.collection.mutable.SortedSet[Int] = TreeSet(1, 2, 3, 4)
  //可变的话生成新的set
  sortS + (88,22,55,11)                           //> res4: scala.collection.mutable.SortedSet[Int] = TreeSet(1, 2, 3, 4, 11, 22, 
                                                  //| 55, 88)
 sortS += (88,22,55,11)                           //> res5: scala.collection.mutable.SortedSet[Int] = TreeSet(1, 2, 3, 4, 11, 22, 
                                                  //| 55, 88)
  s ++ List(1, 2, 3)                              //> res6: scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
  var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)      //> list  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  list.filter(_>5).map(_+10).foreach(println(_))  //> 16
                                                  //| 17
                                                  //| 18
                                                  //| 19
  list.take(2)                                    //> res7: List[Int] = List(1, 2)
  list.filter(_>5).map(_+2).reduce(_+10+_)        //> res8: Int = 68
  var list2 = List("a", "b", "c", "d")            //> list2  : List[String] = List(a, b, c, d)
 	list zip list2                            //> res9: List[(Int, String)] = List((1,a), (2,b), (3,c), (4,d))
 	var list3 = List(List(1,2), List(5,6),List(8,9))
                                                  //> list3  : List[List[Int]] = List(List(1, 2), List(5, 6), List(8, 9))
 	list3.flatten                             //> res10: List[Int] = List(1, 2, 5, 6, 8, 9)
 	list3.flatMap(_.map(3*_))                 //> res11: List[Int] = List(3, 6, 15, 18, 24, 27)
 	list3.map(_.map(_*3))                     //> res12: List[List[Int]] = List(List(3, 6), List(15, 18), List(24, 27))
 	
}