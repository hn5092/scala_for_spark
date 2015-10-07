package com.x.one

/**
 * @author xym
 */
class Person {
  var name : String = _
  var age : Int  = _
  // 限制作用yu
  private[one] val gender = "male"
  def sayHello(){
    println(this.name+":"+ this.age + "hello spark")
  }
}
/**
 * @author xym
 */
object OOPs {
  def main(args: Array[String]): Unit = {
    val p = new Person
    p.name = "spark"
    p.age = 11
    println(p.name + ":" + p.age)
    p.sayHello()
    println(p.gender)
  }
  
}

