package FP

object Q2 {
  
  def main(args:Array[String])
  {
    //sub two rational numbers (Q2)
    sub(3,4,5,8,2,7)                            //(x1/y1)-(x2/y2)-(x3/y3)
    
  }
  
  def sub(x1:Int,y1:Int,x2:Int,y2:Int,x3:Int,y3:Int)
  {
    val x = (x1*y2)-(x2*y1)       
    val y = y1*y2
    val finalx = (x*y3)-(y*x3)            //(x/y)-(x3/y3)
    val finaly = y*y3
    println("Answer is : "+finalx+"/"+finaly)  
  }
  
}

  