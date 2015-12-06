def swap(obj: Object) = // The difference with = or without =
{
    var result = obj match
    {
        case (a,b)=>(b,a)
        case Array(a,b, rest @  _*) => (Array(b,a) ++ rest).mkString
        case _ => "Please input a tuple or array"
    }
    println(result)
    result 
}


val t1 = (1, 2)
val t2 = Array(6,7,8,9)
val t3 = Array(5)
println(swap(t1))
println(swap(t2))
println(swap(t3))
