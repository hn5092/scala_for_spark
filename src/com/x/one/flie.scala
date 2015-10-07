package com.x.one
import scala.io.Source

/**
 * @author xym
 */
class flie {
  
}
object FileOps{
  def main(args: Array[String]): Unit = {
//    val file = Source.fromFile("E:\\t.txt")
    val file = Source.fromURL("http://www.51cto.com","GBK")
    val s = "ss"
    for(lile <- file.getLines()){
      println(lile)
    }
  }
}