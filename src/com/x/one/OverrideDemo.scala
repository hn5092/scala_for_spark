package com.x.one


/**
 * @author xym
 */
class OverrideDemo {
  
}
class Per(var name :String ,var age : Int){
  println(" the primary constructor of Person")
  val school = "BJU"
  override def toString = "11"
}
class Worker(name : String, age : Int, salary : Long) extends Per(name,age){
  println("This is the subclass of Person, Primary  constructor of Worker")
  override val school = "xxx"
  override def toString : String = {
    var a = "11"
    a=a+"22"
    a
  }
}
object OverrideDemo{
 def main(args: Array[String]): Unit = {
   val w = new Worker("Spark", 5, 1000)
   println(w.toString())
 } 
 
}