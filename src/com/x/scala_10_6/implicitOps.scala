package com.x.scala_10_6

import java.io.File

import scala.io.Source

import Conversion.file2RicherFile
import Conversion.name

/**
 * @author xym
 */
class RicherFile(val file: File) {
  def readAll = Source.fromFile(file.getPath).mkString
}
object Conversion {
  implicit def file2RicherFile(file: File) = new RicherFile(file)
  implicit val name = "implicited!"
  def go(implicit name: String) {
    println(name)
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
  Conversion.go //饮食参数可以这样写
  //   Conversion.go
  //只能有一个参数
  implicit class MoreFile(st: String) {
    def add {
      println("add " + st)
    }
  }
  //如果没有加参数的话就不用括号了..
  "11".add
}