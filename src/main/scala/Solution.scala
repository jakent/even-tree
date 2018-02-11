import scala.io.Source

object Solution {

  def main(args: Array[String]) {
    val lines = Source.stdin.getLines
    val nEdges = lines.next.split(" ")(1).toInt

    val edges = lines.take(nEdges).map(_.split(" ").map(_.toInt).toList).toList
    Tree.evenForests(Tree(edges))
  }
}