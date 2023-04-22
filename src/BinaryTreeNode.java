// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman

/**
 * A node in a binary tree.
 *
 * @param <dataType> the type of data stored in the binary tree node.
 */
public class BinaryTreeNode<dataType>
{
   dataType data;
   BinaryTreeNode<dataType> left;
   BinaryTreeNode<dataType> right;

   /**
    * Creates a new BinaryTreeNode with the given data, left child, and right child.
    *
    * @param d the data to store in the node.
    * @param l the left child of the node.
    * @param r the right child of the node.
    */
   public BinaryTreeNode ( dataType d, BinaryTreeNode<dataType> l, BinaryTreeNode<dataType> r )
   {
      data = d;
      left = l;
      right = r;
   }
   /**
    * Returns the left child of this node.
    *
    * @return the left child of the node, or null if the node has no left child.
    */
   BinaryTreeNode<dataType> getLeft () { return left; }

   /**
    * Returns the right child of this node.
    *
    * @return the right child of the node, or null if the node has no right child.
    */
   BinaryTreeNode<dataType> getRight () { return right; }
}
