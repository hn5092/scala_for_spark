package com.x.def2

import org.omg.CORBA.Object

/**
 * @author xym
 */
class demo2 {
  
}
object test extends App{
 def add(a : Int, b : Int): Int ={
   a+b
 } 
 val sum = add _
 println(sum(1,2))
 
 
}