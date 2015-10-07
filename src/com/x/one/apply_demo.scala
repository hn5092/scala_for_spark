package com.x.one

/**
 * @author xym
 */
class ApplyDemo {
  
}
class ApplyTest{
  def apply() = "this apply is in the class applytest"
  def haveATry{
    println("have a try on apply")
  }
}
object ApplyTest{
  def apply() = new ApplyTest
}
object ApplyDemo extends App{
  val a = ApplyTest()
  a.haveATry
  println(a())
  
  
}