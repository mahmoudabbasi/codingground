trait friendly {
    def msg():String={
        return "Hello"
    }
}

class dog extends friendly 
{
    override def msg()="salam" 
}

object sampletrait {
   def main(args: Array[String]) {
     val pier :friendly = new dog
     println(pier.msg())
   }
}