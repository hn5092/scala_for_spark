package com.x.two

/**
 * @author xym
 */
object PateernMathOps extends App{
  val number = 1
  val result = number match{
    case 1=> "frist"
    case 2=> "second"
    case _=> "no"
  }
    //匹配类型
    val result2 = number match{
      //number只是接受的一个常量 叫什么无所谓的
    case number if number == 1 => "the frist"
    case number if number == 2 => "second"
    case _=> "no"
  }
  println(result)
  println(result2)
  
  //模式匹配
  def Type(t:Any) = t match{
    case p : Int => println(" It is Integer")
    case p : String => println("It is String")
  }
  Type(number)
  
  
  
  //进行类的匹配   可以精确匹配某个对象
  def caseClassMatch(p : APerson){
    p match{
      case Employee("this") => println("this is the this ")
      case Employee(_)      => println("this is employee")
      case Employer(_) => println("this is employer")
    }
  }
  
  caseClassMatch(Employee("spark"))
}
abstract class APerson
case class Employee(name : String) extends APerson
case class Employer(name : String) extends APerson