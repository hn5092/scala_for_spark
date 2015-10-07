package com.x.one

/**
 * @author xym
 */
class test {
  
}
object test{
  def lop(x : Long, y : Long): Long = {
    var a = x
    var b = y
    while(a != 0){
      val temp = a
      a = b % a
      b = temp
    }
    var line = ""
    do{
//      line = readLine() 
      println("Read:"+line)
    }while(line != "")
      
      
     for(i <- 1 to 10){
       println()
     }
    //for循环
    val files = (new java.io.File(".")).listFiles()
   
    for(file <- files){
      println(file)
    }
    //延迟加载
    lazy val sum = 10 
    
    b
  }
  def main(args:Array[String]){
//    println("this is scala")
//    var file = if(!args.isEmpty) args(0) else "spark.xml"
//    
//    println(file) 
    println(lop(100,298))
  }
}