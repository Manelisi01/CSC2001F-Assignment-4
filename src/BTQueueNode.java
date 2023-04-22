// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman
/**
 * A node for use in a binary tree queue.
 *
 * @param <dataType> the type of data stored in the binary tree node.
 */
public class BTQueueNode<dataType>
{
   BinaryTreeNode<dataType> node;
   BTQueueNode<dataType> next;

   /**
    * Creates a new BTQueueNode with the given BinaryTreeNode and next node.
    *
    * @param n the BinaryTreeNode to store in the node.
    * @param nxt the next BTQueueNode in the queue.
    */
   public BTQueueNode ( BinaryTreeNode<dataType> n, BTQueueNode<dataType> nxt )
   {
      node = n;
      next = nxt;
   }
}
