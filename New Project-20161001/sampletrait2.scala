trait x {
    def msg()="hi"
}
class y extends x {
    override def msg()= "sample1"
}
class y1 extends x {
    override def msg()= "sample2"
}
class z1 extends y {
    override def msg()= "samplez1"
}
 trait x1 extends x {
     override def msg()=super.msg() + "!"
 }
 
object sampletrait2 {
   def main(args: Array[String]) {
        var pet: x = new y
        println(pet.msg())
        
        pet = new y1
        println(pet.msg())
        
        pet = new z1
        println(pet.msg())
        
        pet = new y with x1
        println(pet.msg())
        
        pet = new y1 with x1
        println(pet.msg())
        
        pet = new z1 with x1
        println(pet.msg())
   }
}
 
 