package com.x.one
import scala.io.Source

/**
 * @author xym
 */
class flie {

}
object FileOps {
  def main(args: Array[String]): Unit = {
    //    val file = Source.fromFile("E:\\t.txt")
    val file = Source.fromURL("http://www.51cto.com", "GBK")
    val s = "ss"
    val s1 = (1, 2, 3, 4)
    println(s1.productArity)
    for (lile <- 0 until s1.productArity) {
      println(lile)
    }
  }
}