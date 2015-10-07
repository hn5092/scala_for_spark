package com.x.one

/**
 * @author xym
 */
class TraitDemo {
  
}
object tarit extends App{
  val Logger = new ConcreateLogger
  Logger.concretelog
}
trait TraitLgger{
  def log(msg : String)
  
}

trait ConsoleLogger extends TraitLgger{
  def log(){
    log("here is spark");
  }
}
trait  Longger{
  def long(msg:String){
    println("log"+msg)
  }
}
class ConcreateLogger extends Longger{
  def concretelog{
    long("its eme !!")
  }
}