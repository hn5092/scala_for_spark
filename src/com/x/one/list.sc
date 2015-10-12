package com.x.one
import collection.mutable.ArrayBuffer
import scala.collection.mutable.ListBuffer
class list {

}

object list {
  Map("spark" -> 5, "hadoop" -> 7)                //> res0: scala.collection.immutable.Map[String,Int] = Map(spark -> 5, hadoop ->
                                                  //|  7)
  scala.collection.mutable.Map("spark" -> 5)      //> res1: scala.collection.mutable.Map[String,Int] = Map(spark -> 5)
  1 to 10                                         //> res2: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7
                                                  //| , 8, 9, 10)
  1 to 10                                         //> res3: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7
                                                  //| , 8, 9, 10)
  1 until 10                                      //> res4: scala.collection.immutable.Range = Range(1, 2, 3, 4, 5, 6, 7, 8, 9)

  Range(1, 10)                                    //> res5: scala.collection.immutable.Range = Range(1, 2, 3, 4, 5, 6, 7, 8, 9)
  //带步长
  Range(1, 10, 3)                                 //> res6: scala.collection.immutable.Range = Range(1, 4, 7)

  Range(1, 10, -1)                                //> res7: scala.collection.immutable.Range = Range()
  Range(10, 0, -1)                                //> res8: scala.collection.immutable.Range = Range(10, 9, 8, 7, 6, 5, 4, 3, 2, 1
                                                  //| )
  Range(9, -1, -1)                                //> res9: scala.collection.immutable.Range = Range(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
                                                  //| 
  var list = List(1, 2, 3)                        //> list  : List[Int] = List(1, 2, 3)
  val arrbuff1 = ArrayBuffer[Int]()               //> arrbuff1  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
  val arrBuff2 = ArrayBuffer(1, 3, 4, -1, -4)     //> arrBuff2  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 3, 4,
                                                  //|  -1, -4)
  arrbuff1 += 23 //用+=在尾端添加元素                     //> res10: com.x.one.list.arrbuff1.type = ArrayBuffer(23)
  arrbuff1 += (2, 3, 4, 32) //同时在尾端添加多个元素         //> res11: com.x.one.list.arrbuff1.type = ArrayBuffer(23, 2, 3, 4, 32)
  arrbuff1 ++= arrBuff2 //可以用 ++=操作符追加任何集合        //> res12: com.x.one.list.arrbuff1.type = ArrayBuffer(23, 2, 3, 4, 32, 1, 3, 4, 
                                                  //| -1, -4)
  arrbuff1 ++= Array(2, 43, 88, 66)               //> res13: com.x.one.list.arrbuff1.type = ArrayBuffer(23, 2, 3, 4, 32, 1, 3, 4, 
                                                  //| -1, -4, 2, 43, 88, 66)
  arrbuff1.trimEnd(2) //移除最后的2个元素
  arrbuff1.remove(2) //移除arr(2+1)个元素              //> res14: Int = 3
  arrbuff1.remove(2, 4) //从第三个元素开始移除4个元素
  val arr = arrbuff1.toArray //将数组缓冲转换为Array      //> arr  : Array[Int] = Array(23, 2, 4, -1, -4, 2, 43)
  val arrbuff2 = arr.toBuffer //将Array转换为数组缓冲     //> arrbuff2  : scala.collection.mutable.Buffer[Int] = ArrayBuffer(23, 2, 4, -1,
                                                  //|  -4, 2, 43)
  list.head                                       //> res15: Int = 1
  //除了第一个元素外的其他元素列表
  list.tail                                       //> res16: List[Int] = List(2, 3)
  var list2 = 1 :: Nil                            //> list2  : List[Int] = List(1)
  2 :: list2                                      //> res17: List[Int] = List(2, 1)
  //把左边的加入右边
  list :: list2                                   //> res18: List[Any] = List(List(1, 2, 3), 1)

  Nil                                             //> res19: scala.collection.immutable.Nil.type = List()
  var listBuffer = ListBuffer(0)                  //> listBuffer  : scala.collection.mutable.ListBuffer[Int] = ListBuffer(0)
  listBuffer += 1                                 //> res20: scala.collection.mutable.ListBuffer[Int] = ListBuffer(0, 1)
  listBuffer ++= list                             //> res21: scala.collection.mutable.ListBuffer[Int] = ListBuffer(0, 1, 1, 2, 3)
                                                  //| 
  //没有自身+
  listBuffer ++ list                              //> res22: scala.collection.mutable.ListBuffer[Int] = ListBuffer(0, 1, 1, 2, 3,
                                                  //|  1, 2, 3)
  //减少如果没有是不会减少
  listBuffer -= 5                                 //> res23: scala.collection.mutable.ListBuffer[Int] = ListBuffer(0, 1, 1, 2, 3)
                                                  //| 
  listBuffer --= list                             //> res24: scala.collection.mutable.ListBuffer[Int] = ListBuffer(0, 1)
  //变成不可变
  listBuffer.toList                               //> res25: List[Int] = List(0, 1)
}