package com.x.scala_10_6

import java.io.File

import scala.io.Source

import Conversion.file2RicherFile

/**
 * @author xym
 * 1.对象不存在该方法
 * 2.表达式类型跟我们的类型不一致 参数类型
 * 3.方法参数不一致 个数类型等  
 * 
 * 1.不发生转换,存在二异性 不发生转换 会报错  比如2个转换
 * 2.多个隐式转换只发生一个
 */
class RicherFile(val file: File) {
  def readAll = Source.fromFile(file.getPath).mkString
}
object Conversion {
  implicit def file2RicherFile(file: File) = new RicherFile(file)
  //类型跟匹配 就能直接用
  implicit val name2 = "h!"
//  implicit val name = "implicited!"
  def go(implicit name: String) {
    println(name)
  }
  //一般隐式参数的话 不建议基本类型
   def go2(implicit name: String, age : String) {
    println(name+age)
  }
  def go1(name: String) {
    println(name)
  }
}
//注意顺序不能在之前 需要之后才可以
object implicitOps extends App {
  import Conversion._
  println("new file")
  println(new File("E:\\t.txt").readAll)
  Conversion.go("dasdas1")
  Conversion.go //隐式参数可以这样写
  Conversion.go2("xym","11")
  Conversion.go //饮食参数可以这样写
  Conversion.go2
  //   Conversion.go
  //只能有一个参数
  implicit class MoreFile(st: String) {
    def add {
      println("add " + st)
    }
  }
  //如果没有加参数的话就不用括号了..
  "11".add
  1 to 10
  1 * 2
}