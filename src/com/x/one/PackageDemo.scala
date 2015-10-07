package com.x.one

/**
 * @author xym
 */
class PackageDemo {
  
}
package bob{
  package navi{
    private[one] class Nav{
      protected[navi] def user(){}
      class Leg{
        private[navi] val distance = 100
        
      }
      private[this] var speed = 200
    }

  }


package launch{
  import navi._
  object Vehicle{
    private[launch] val guide = new Nav
  }
}
}

object Pakca {
  def main(args: Array[String]): Unit = {
      import bob.navi
      println("11")
  }

}