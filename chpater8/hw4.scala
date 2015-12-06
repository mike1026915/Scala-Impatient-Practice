import scala.collection.mutable.ArrayBuffer

abstract class Item
{
   def price: Int;
   def description: String
}

class SimpleItem(val price: Int, val description: String) extends Item
{
}

class Bundle extends Item
{
     var itemList = new ArrayBuffer[Item]()

     def addItem(item: Item) = 
     {
         itemList += item
     }

     def price = 
     {
         var total = 0  
         for ( i<- 0 until itemList.length)
             total += itemList(i).price
         total
     }
     def description =
     {
         var result = ""
         for ( i<- 0 until itemList.length)
             result += itemList(i).description + " "
         result
     }

}


var s1 = new SimpleItem(15,"Item1")
var s2 = new SimpleItem(16,"Item2")
println(s1.price + " " + s1.description)
println(s2.price + " " + s2.description)
var b = new Bundle()
println(b.price + " " + b.description)
b.addItem(s1)
println(b.price + " " + b.description)
b.addItem(s2)
println(b.price + " " + b.description)

