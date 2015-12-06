sealed abstract class Tree
case class Leaf(value: Int) extends Tree
case class Node(child: Tree*) extends Tree

def leafSum(bt: Tree): Int =
{
    bt match
    {
        case Leaf(x) => x
        case Node( x, other @ _* ) => leafSum(x) + other.map(leafSum _).sum
    }
}

val root: Tree = Node(Leaf(1),Node(Leaf(2),Leaf(3)))
val root2 : Tree = Node(Node(Leaf(3), Leaf(8)),Leaf(2),Node(Leaf(5)))
val one : Tree =Node(Leaf(1))
println(leafSum(root))
println(leafSum(root2))
println(leafSum(one))

