// this is my demo scala program for 
object Demo1{
def main (args:Array[String])
  {
    val numbers =List("moulali  ","    Karishma   ", "   rojaaa","    dihan  ")
    val res = numbers.map(x=>x.trim().toUpperCase())
    res.collect
    }
}
