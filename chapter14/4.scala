abstract class Item
case class  Article(description: String, price: Double) extends Item
case class  Bundle(description: String, discount: Double, items: Item*) extends Item
case class  Multiple(number: Int,item: Item) extends Item

def price(it: Item): Double = it match
{
    case Article(_, p ) => p
    case Bundle(_, disc, its  @ _*) => its.map(price _).sum - disc
    case Multiple(n, its) => price(its) * n
}


val  t: Item = Bundle("special", 20.0, Article("scala" ,39.95),Bundle("sampler", 10,  Article("Whiskey" ,79.95) ,Article("Gin",  32.95)))
val m: Multiple = Multiple(10,t)

println(price(t))
println(price(m))
