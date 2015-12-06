sealed abstract class BinaryTree
case class Leaf(value: Int) extends BinaryTree
case class Node(left: BinaryTree, right:BinaryTree) extends BinaryTree

def leafSum(bt: BinaryTree): Int =
{
    bt match
    {
        case Leaf(x) => x
        case Node(x,y) => leafSum(x) + leafSum(y)
    }
}

val root: BinaryTree = Node(Leaf(1),Node(Leaf(2),Leaf(3)))
println(leafSum(root))
