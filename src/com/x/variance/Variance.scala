package com.x.variance

/**
 * @author xym
 */
object Variance extends App{
  val a = new V[String].m("xym")
  val b = new V[Object].m("xym")
  //scala  默认 参数逆变   返回值协变
  //逆变 
  val c:V[String] = new V[Object]
  //协变是从上层变到底层   scala规定 协变只能作用于返回值 逆变只能作用于参数  目的是让返回值类型更精确
  val d:V2[Object] = new V2[String]
}

class V[-T]{
  def m (v : T){
    println(v)
  }
  type callb = {def call:Unit}
}
class V2[+T]{
  type callb = {def call:Unit}
}