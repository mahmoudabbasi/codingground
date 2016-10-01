object looparg{
   def main(args: Array[String]) {
        var i = 0
        while (i < args.length) {
          println( i+ "::" +args(i))
          i += 1
        }
   }
}