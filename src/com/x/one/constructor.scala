package com.x.one

/**
 * @author xym
 */
// 主构造器会生成自己的bean
class Constructor_( name : String, val age : Int)  {  // 伴生类
  println(name + "this is a primary constructor")
  var gender : String = _
  private  var info = "yunnan"
  def this(name : String , age : Int , gender : String){
    this(name,age)
    this.gender = gender
  }
  
}

object Constructor_{ //伴生对象
  def main(args: Array[String]): Unit = {
    
  }
  def sayhi
  {
    println(" hi")
  }
}
object OOp{
  def main(args: Array[String]): Unit = {
    val p = new Constructor_("xym", 11)
    println(":" + p.age)
    val p1 = new Constructor_("spark" , 11 , "male")
    println (p1.gender)
    Constructor_.sayhi
  }
  
}