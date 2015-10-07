package com.x.one

import scala.collection.mutable.ListBuffer
class list {


}

object list {
	Map("spark"->5 , "hadoop" -> 7)           //> res0: scala.collection.immutable.Map[String,Int] = Map(spark -> 5, hadoop ->
                                                  //|  7)
  scala.collection.mutable.Map("spark"->5)        //> res1: scala.collection.mutable.Map[String,Int] = Map(spark -> 5)
  1 to 10                                         //> res2: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7
                                                  //| , 8, 9, 10)
	1 to 10                                   //> res3: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7
                                                  //| , 8, 9, 10)
  1 until 10                                      //> res4: scala.collection.immutable.Range = Range(1, 2, 3, 4, 5, 6, 7, 8, 9)
  
  Range(1,10)                                     //> res5: scala.collection.immutable.Range = Range(1, 2, 3, 4, 5, 6, 7, 8, 9)
  //带步长
  Range(1,10,3)                                   //> res6: scala.collection.immutable.Range = Range(1, 4, 7)
  
  Range(1,10,-1)                                  //> res7: scala.collection.immutable.Range = Range()
  Range(10,0,-1)                                  //> res8: scala.collection.immutable.Range = Range(10, 9, 8, 7, 6, 5, 4, 3, 2, 1
                                                  //| )
  Range(9,-1,-1)                                  //> res9: scala.collection.immutable.Range = Range(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
                                                  //| 
	var list = List(1, 2, 3)                  //> list  : List[Int] = List(1, 2, 3)
	
	list.head                                 //> res10: Int = 1
	//除了第一个元素外的其他元素列表
	list.tail                                 //> res11: List[Int] = List(2, 3)
	var list2 = 1::Nil                        //> list2  : List[Int] = List(1)
	2::list2                                  //> res12: List[Int] = List(2, 1)
	//把左边的加入右边
	list::list2                               //> res13: List[Any] = List(List(1, 2, 3), 1)

	
	Nil                                       //> res14: scala.collection.immutable.Nil.type = List()
	var listBuffer = ListBuffer(0)            //> listBuffer  : scala.collection.mutable.ListBuffer[Int] = ListBuffer(0)
	listBuffer += 1                           //> res15: scala.collection.mutable.ListBuffer[Int] = ListBuffer(0, 1)
	listBuffer ++= list                       //> res16: scala.collection.mutable.ListBuffer[Int] = ListBuffer(0, 1, 1, 2, 3)
                                                  //| 
  //没有自身+
  listBuffer ++ list                              //> res17: scala.collection.mutable.ListBuffer[Int] = ListBuffer(0, 1, 1, 2, 3, 
                                                  //| 1, 2, 3)
  //减少如果没有是不会减少
	listBuffer -= 5                           //> res18: scala.collection.mutable.ListBuffer[Int] = ListBuffer(0, 1, 1, 2, 3)
                                                  //| 
  listBuffer --= list                             //> res19: scala.collection.mutable.ListBuffer[Int] = ListBuffer(0, 1)
  //变成不可变
  listBuffer.toList                               //> res20: List[Int] = List(0, 1)
}