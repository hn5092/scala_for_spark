package com.x.one

/**
 * @author xym
 */
class AbstractDemo {
  
}
abstract class Teacher{
  def teach
  val name : String
  var age :Int 
}

class TeacherForMaths extends Teacher{
  def teach{
    println("teacher ")
  }
  var age = 12
  val name = "xym"
}
object AbstractClassOps{
  def main(args: Array[String]): Unit = {
    val teacher = new TeacherForMaths
    teacher.teach
  }
}