import math._
def compose(a: Double => Option[Double], b:Double => Option[Double]): Double => Option[Double] =
{
    def h(x:Double): Option[Double] =
    {
        if(a(x).isEmpty || b(x).isEmpty  )
            None
        else
            Some(1.0)
    }
    h
}


def f(x : Double) = if ( x >= 0) Some(sqrt(x)) else None
def g(x : Double) = if ( x != 1) Some( 1 / ( x - 1)) else None
val h = compose(f,g)
println(h(2))
println(h(1))
println(h(0))
println(h(-1))
