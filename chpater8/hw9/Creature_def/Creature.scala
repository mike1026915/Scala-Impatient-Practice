class Creature
{
  def range: Int = 10
  val env: Array[Int] = new Array[Int](range)
}

class Ant extends Creature
{
  override val range = 2
}

class NewAnt extends {override val range = 2 } with Creature
{
}

object MyApp
{
  def main(args: Array[String])
  {
     var a1 = new Ant()
     var a2 = new NewAnt()
     println(a1.env.length)
     println(a2.env.length)  
  
  }

}
