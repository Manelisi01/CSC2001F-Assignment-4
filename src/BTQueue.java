// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman
/**
 * A queue implementation for binary tree nodes.
 *
 * @param <dataType> the type of data stored in the binary tree nodes.
 */
public class BTQueue<dataType>
{   
   BTQueueNode<dataType> head;
   BTQueueNode<dataType> tail;

   /**
    * Creates a new, empty BTQueue.
    */
   public BTQueue ()
   {
      head = null;
      tail = null;
   }

   /**
    * Removes and returns the next node in the queue.
    *
    * @return the next node in the queue, or null if the queue is empty.
    */
   public BinaryTreeNode<dataType> getNext ()
   {
      if (head == null)
         return null;
      BTQueueNode<dataType> qnode = head;
      head = head.next;
      if ( head == null )
         tail = null;
      return qnode.node;
   }


   /**
    * Adds a node to the end of the queue.
    *
    * @param node the node to add to the queue.
    */
   public void enQueue ( BinaryTreeNode<dataType> node )
   {
      if (tail == null)
      {   
         tail = new BTQueueNode<dataType> (node, null);
         head = tail;
      }   
      else
      {
         tail.next = new BTQueueNode<dataType> (node, null);
         tail = tail.next;
      }   
   }   
}
