package com.x.one

import scala.collection.mutable.ArrayBuffer

/**
 * @author xym
 */
object ScalaWork {
  def main(args: Array[String]): Unit = {
    print("wrie")
  val s = Set(1,2,3)
  val l = List(1,2,3,5)
  
  val n = 99
  try{
  val half = if(n % 2 == 0) n / 2 else throw
    new RuntimeException("N must be even")
  }catch {
    case t: Throwable => println("这个异常") // TODO: handle error
  }finally{
    println("wokao")
  }
  
  var array =  ArrayBuffer(1,2,3,4,5)
  array.insert(0, 1)
  println(array.length)
  
  val age = Map("xym"-> 11,"name" -> 5)
  
  for((k,_) <- age){
    println(k)
  }
  
  val truple = (1,2,3,4,5,6)
  truple._1
  }
  
}