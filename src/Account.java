
/**
 * This is an Account Class that stores Post Objects and adds Post Objects in a BST within it's self.
 * */







public class Account implements Comparable<Account>
{

  public String name;
  public String description;
  public BinarySearchTree<Post> post_tree = new BinarySearchTree<Post>(); // Binary tree to store Post Accounts objects


  /**
   * This is a constructor to initialise the name and description of the account
   * @param name String
   * @param description String
   *
   * */
  public Account(String name,String description)
  {
    this.name = name;
    this.description = description;
  
  }


  /**
   *
   * This method compares two Account objects
   * @param account which is a Account objects
   * @return int depending on outcome of the comparison
   *
   */

  public int compareTo(Account account)
  {
  
    return name.compareTo(account.name);
  
  }


  /**
   * @return name which is a string initialised in the constructor
   */


  public String toString()
  {
  
    return name;
  
  
  }

  /**
   * @return description of the class which is a string
   * */
  public String getDescription()
  {
  
    return description;
  
  }


  /**
   *
   *This method adds and stores a post in the Account object via a Binary Search Tree (BST)
   * @param post which is a Post object
   */


  public void addPost(Post post)
  {
  
  	post_tree.insert(post);
  
  }
  
  /**
   * This method lists posts in descending order of when each post was created. This is done from a BST on the particular Account object
   * */
  public void listPosts()
  
  {
  
  	post_tree.descendingOrderTraversal();
  
  }

























}
