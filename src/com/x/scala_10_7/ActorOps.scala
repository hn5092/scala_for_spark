package com.x.scala_10_7

import java.net._

import scala.actors._
import scala.actors.Actor._
/**
 * 不共享任何数据  依靠消息传递 
 * java是基于资源共享和锁模型 导致死锁和资源争用
 * 
 */
/**
 * 
! 

发送异步消息，没有返回值。

!?

发送同步消息，等待返回值。（会阻塞发送消息语句所在的线程）

!!

发送异步消息，返回值是 Future[Any]。

? 

不带参数。查看 mailbox 中的下一条消息。
channel
 */
class ActorOps{
  
}
object HelloActor extends Actor{
  def act(){
    while(true){
      //用来接收信息
      receive {
//        case msg => println("Recive message : " + msg)
        case x :String => println("this is string")
        case x : Int => println("got an Int:")
        case _  => println("other type")
      }
      //处理完成之后不返回处理器  抛异常清堆栈
      react{
        case (name : String, actor : Actor) => actor ! getIp(name)
        case "EXIT" => println("")
      }
      //设置超时时间去处理
      receiveWithin(1000){case x => println(x)}
    }
    def getIp(name : String):Option[InetAddress] = {
      try {
    	  Some(InetAddress.getByName(name))
      }catch{
        case _ : UnknownHostException => None
      }
    }
//    for (i <- 1 to 5){
//      println("this is a scala actor"+i)
//      Thread.sleep(1000)
//    }
  }
}
object ActorOps{
  def main(args: Array[String]): Unit = {
    HelloActor.start
    HelloActor ! "Hi,this is hello"
    HelloActor ! 2
    HelloActor ! ("www.baidu.com",self)
    receiveWithin(1000){case x => println(x+"i ")}
    //立即启动
//    val secondActor = actor{
//       for (i <- 1 to 5){
//      println("this is a scala actor"+i+"++++")
//      Thread.sleep(1000)
//    }
//    }
}}