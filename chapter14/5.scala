def leafSum(tree: List[Any]): Int =
{
   var sum = 0
   for(i <- tree)
   {
       i match
       {  
           case x: Int => sum += x
           case x: List[Any]  => sum += leafSum(x)
       }
   }
   sum
   
}


println(leafSum( List(List(3, 8), 2, List(5))  ))
