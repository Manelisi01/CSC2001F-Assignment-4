// Hussein's Binary Search Tree
// 27 March 2017
// Hussein Suleman

/**
 * An implementation of a binary search tree.
 * Extends the BinaryTree class.
 * @param <dataType> The type of data stored in the nodes of the tree.
 */
public class BinarySearchTree<dataType extends Comparable<? super dataType>> extends BinaryTree<dataType>
{
   /**
    * Inserts a new node with the specified data into the tree.
    * @param d The data to insert.
    */
   public void insert ( dataType d )
   {
      if (root == null)
         root = new BinaryTreeNode<dataType> (d, null, null);
      else
         insert (d, root);
   }

   /**
    * Helper method for inserting a new node with the specified data into the tree.
    * @param d The data to insert.
    * @param node The root of the subtree to insert into.
    */
   public void insert ( dataType d, BinaryTreeNode<dataType> node )
   {
      if (d.compareTo (node.data) <= 0)
      {
         if (node.left == null)
            node.left = new BinaryTreeNode<dataType> (d, null, null);
         else
            insert (d, node.left);
      }
      else
      {
         if (node.right == null)
            node.right = new BinaryTreeNode<dataType> (d, null, null);
         else
            insert (d, node.right);
      }
   }


   /**
    * Searches for a node with the specified data in the tree.
    * @param d The data to search for.
    * @return The node with the specified data, or null if it is not found.
    */
   public BinaryTreeNode<dataType> find ( dataType d )
   {
      if (root == null)
         return null;
      else
         return find (d, root);
   }

   /**
    * Helper method for searching for a node with the specified data in the tree.
    * @param d The data to search for.
    * @param node The root of the subtree to search in.
    * @return The node with the specified data, or null if it is not found.
    */
   public BinaryTreeNode<dataType> find ( dataType d, BinaryTreeNode<dataType> node )
   {
      if (d.compareTo (node.data) == 0) 
         return node;
      else if (d.compareTo (node.data) < 0)
         return (node.left == null) ? null : find (d, node.left);
      else
         return (node.right == null) ? null : find (d, node.right);
   }

   /**
    * Deletes the node with the specified data from the tree.
    * @param d The data to delete.
    */
   public void delete ( dataType d )
   {
      root = delete (d, root);
   }


   /**
    * Helper method for deleting the node with the specified data from the tree.
    * @param d The data to delete.
    * @param node The root of the subtree to delete from.
    * @return The root of the updated subtree.
    */
   public BinaryTreeNode<dataType> delete ( dataType d, BinaryTreeNode<dataType> node )
   {
      if (node == null) return null;
      if (d.compareTo (node.data) < 0)
         node.left = delete (d, node.left);
      else if (d.compareTo (node.data) > 0)
         node.right = delete (d, node.right);
      else if (node.left != null && node.right != null )
      {
         node.data = findMin (node.right).data;
         node.right = removeMin (node.right);
      }
      else
         if (node.left != null)
            node = node.left;
         else
            node = node.right;
      return node;
   }

   /**
    * Finds the node with the minimum value in the tree.
    * @param node The root of the subtree to search in.
    * @return The node with the minimum value.
    */
   public BinaryTreeNode<dataType> findMin ( BinaryTreeNode<dataType> node )
   {
      if (node != null)
         while (node.left != null)
            node = node.left;
      return node;
   }

   /**
    * Removes the node with the minimum value in the tree.
    * @param node The root of the subtree to remove from.
    * @return The root of the updated subtree.
    */
   public BinaryTreeNode<dataType> removeMin ( BinaryTreeNode<dataType> node )
   {
      if (node == null)
         return null;
      else if (node.left != null)
      {
         node.left = removeMin (node.left);
         return node;
      }
      else
         return node.right;
   }
   
}
