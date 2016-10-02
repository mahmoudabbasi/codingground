class SimpleGreeter {
  val greeting = "Hello, world!"
  def greet() = println(greeting)
}

object callclass {
   def main(args: Array[String]) {
     val g = new SimpleGreeter
     g.greet()
   }
}