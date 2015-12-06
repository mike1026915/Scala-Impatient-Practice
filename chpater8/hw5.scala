class Point(val x: Double, val y: Double)
{
    override def toString = "(" + x + ", " + y + ")" 
}

class LabeledPoint( val label: String, x: Double, y: Double) extends Point(x, y)
{

}

abstract class Shape
{
     def centerPoint: Point
}

class Rectangle(val centerPoint: Point, val length: Double, val width: Double) extends Shape
{
    override def toString = "I am a Rectangle with length " + length + " and width "+ width + " centered on " + centerPoint
}

class Circle(var centerPoint: Point, val radius: Double) extends Shape
{
    override def toString = "I am a Circle with radius " + radius + " centered on " + centerPoint  
}

var p = new Point(123.25, 23.5)
var lp = new LabeledPoint("Test", 321.25, 72.3)
println(p.x)
println( lp.label + " " + lp.x + " " + lp.y)

val r = new Rectangle(p, 15, 5)
println(r)
val c = new Circle(new Point(55,66), 56)
println(c.centerPoint)
c.centerPoint = new Point(11,22)
println(c)
