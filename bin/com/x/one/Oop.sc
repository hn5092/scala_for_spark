package com.x.one
class xym {


}

object xym {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  (x:Int) => x+1                                  //> res0: Int => Int = <function1>
  val addsum =  (x:Int) => x+1                    //> addsum  : Int => Int = <function1>
  addsum(2)                                       //> res1: Int = 3
  val minilist = List(1,2,3)                      //> minilist  : List[Int] = List(1, 2, 3)
  minilist.map { (x:Int) => x+1 }                 //> res2: List[Int] = List(2, 3, 4)
	minilist.map { _+1 }                      //> res3: List[Int] = List(2, 3, 4)
	
	var a = Array(1, 2, 3, 4, 5, 6, 7)        //> a  : Array[Int] = Array(1, 2, 3, 4, 5, 6, 7)
	a.map(1+_)                                //> res4: Array[Int] = Array(2, 3, 4, 5, 6, 7, 8)
	a.filter { _ > 5 }                        //> res5: Array[Int] = Array(6, 7)
	a.filter(_ > 6)                           //> res6: Array[Int] = Array(7)
	a.reduce(_ + _)                           //> res7: Int = 28
	a.fold(0)(_ + _)                          //> res8: Int = 28
	//指定初始值
	a.fold(1)(_ + _)                          //> res9: Int = 29
	val map = Map("a" -> 1)                   //> map  : scala.collection.immutable.Map[String,Int] = Map(a -> 1)
	def add(x :Int, y: Int): Int = {x+y}      //> add: (x: Int, y: Int)Int
	add(1,2)                                  //> res10: Int = 3
	val sum = add _                           //> sum  : (Int, Int) => Int = <function2>
	Map("spark"->5 , "hadoop" -> 7)           //> res11: scala.collection.immutable.Map[String,Int] = Map(spark -> 5, hadoop -
                                                  //| > 7)
  scala.collection.mutable.Map("spark"->5)        //> res12: scala.collection.mutable.Map[String,Int] = Map(spark -> 5)
  1 to 10                                         //> res13: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 
                                                  //| 7, 8, 9, 10)
	1 to 10                                   //> res14: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 
                                                  //| 7, 8, 9, 10)
  1 until 10                                      //> res15: scala.collection.immutable.Range = Range(1, 2, 3, 4, 5, 6, 7, 8, 9)
}
//匿名函數