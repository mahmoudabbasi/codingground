class repeatmsg(msg:String , count:Int)
{
   // def this (msg, String) = this(msg, 1)
    def greet() = {
    for (i <- 1 to count)
      print(msg+"; ")
  }
}

object repeatdata {
   def main(args: Array[String]) {
     val s1= new repeatmsg("hamed", 5)
     s1.greet()
   }
}