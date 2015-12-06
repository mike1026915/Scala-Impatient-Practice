sealed abstract class Tree
case class Leaf(value: Int) extends Tree
case class Node(operator: Char, child: Tree*) extends Tree

def eval(bt: Tree): Double =
{
    bt match
    {
        case Leaf(x) => x
        case Node( '+', other @ _* ) =>  other.map(eval _).sum
        case Node( '-', other @ _* ) =>  -other.map(eval _).sum
        case Node( '*', other @ _* ) =>  other.map(eval _).product
        case Node( '/', other @ _* ) =>  1 / other.map(eval _).product
    }
}

val root: Tree = Node('+',Leaf(1),Node('+',Leaf(2),Leaf(3)))
val root2 : Tree = Node('+',Node('/',Leaf(4), Leaf(8)),Leaf(2),Node('-',Leaf(5)))
val one : Tree =Node('/',Leaf(2))
println(eval(root))
println(eval(root2))
println(eval(one))

