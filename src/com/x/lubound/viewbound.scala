package com.x.lubound

/**
 * @author xym
 */
package com.x.lubound;


/**
 * @author xym
 */
object ULBounds {
  def main(args: Array[String]): Unit = {
    
    val c = new Compare(3,2)
    print(c.compare)
    //------------------------------
    //分别new2个对象     所以这里的T下界就是Tech
//    val t = new Teach(1)
//    val t2 = new Teach(2)
//    val c1 = new Compare(t,t2)
//    val c2 = c1.replace(t2)
//    print(c2.toString())
    
    
  }
}
class Compare[T <% Comparable[T] ](val num1:T,val num2:T){
  def compare = if(num1.compareTo(num2)<0)num1 else num2
  //替换掉num1 替换为传进去的值
//  def replace[F >: T](f : F) = new Compare(f,num2)
//  override def toString = num1.toString()+"num2"+num2.toString()
}

class Person1(val ID : Int){
  
}

class Teach(ID : Int) extends Person1(ID){
  override def toString = ID+""
}
