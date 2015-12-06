def listSum(data: List[Option[Int]]): Int = 
{
    var total = 0
    for(Some(result) <- data)
       total += result
    total
}

def listSum2(data: List[Option[Int]]): Int =
{
    data.map(_.getOrElse(0)).sum
}


println(listSum(List(Some(1),Some(2),None,Some(3),None,None,Some(4),None,Some(5),Some(1))))
println(listSum2(List(Some(1),Some(2),None,Some(3),None,None,Some(4),None,Some(5),Some(1))))
