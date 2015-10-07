package com.x.two

/**
 * @author xym
 */
object CaseClassOps extends App {
  Person("Spark", 5)
}
case class Person(name : String, age : Int) 