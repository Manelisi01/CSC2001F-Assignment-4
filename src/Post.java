

/**
 * Post Class is for a post object that will be stored in a Account object via a Binary Search Tree(BST)
 *
 * */









public class Post implements Comparable<Post>

{
  /*
  
  Title: More cats playing with wool
  Video: video2.mpg
  Number of likes: 75


*/

  String Title;
  String Video;
  int Likes;
  


  /**
   * Constructor of Post Class
   * @param Title String
   * @param Video String
   * @param Likes int
   * */

  public Post(String Title, String Video, int Likes)
  
  {
     this.Title = Title;
     this.Video = Video;
     this.Likes = Likes;
  
  
  }
  
  /**
   * @param post Object of Post class
   * @return This returns an Integer which is positive or negative given if a particular post is before or after the other
   *  The method compares two Post objects with each other which will be used in constructing a Post BST
   * */
  public int compareTo(Post post)
  
  {
     return Video.compareTo(post.Video); 
  
  
  }

 /**
  * @return String
  * This is a  method that prints out the Title,Video and likes of the Post object
  *
  * */
  public String toString()
  {
  
  	return "\nTitle: "+Title +"\nContent: " + Video +"\nLikes: " + Likes +"\n";
  
  
  }






}
