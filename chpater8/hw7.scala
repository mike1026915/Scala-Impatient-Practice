import java.awt.Rectangle

class Square(x: Int, y: Int, val squareWidth: Int) extends Rectangle(x,y,squareWidth,squareWidth)
{
   println("The corner is at " + x + " " + y + ", the width is " + squareWidth )
   def this(squareWidth: Int)
   {
       this(0, 0, squareWidth)
   }    
   def this()
   {
       this(0, 0, 0)
   }
}

val s1 = new Square(5,5, 1)
val s2 = new Square(10)
val s3 = new Square()
