package com.x.def2;

/**
 * @author xym
 */
class Func1 {
  def show1(){
    print("hahah")
  }
}

object Func{
  def processFile(filenam : String, width : Int){
   
    
}
  def apply( ) = new Func1
  
}
object asdas extends App{
   val add = (x : Int) =>x +100
    def add2(x : Int) = x +100
    val ada = add(_)
    println(ada(1001))
    val a = Func()
    a.show1()
}