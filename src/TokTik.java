import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files and other inputs from user

/** TokTick TokTik Class then runs a main method that provides
 a text menu interface to provide functionality for the user to find, list, create, delete and load
 accounts from a file. The TokTik Class also provides functionality for the user to display all posts for a
 single account and add a new post for an account.*/

public class TokTik

{


   public static void main( String [] args)
   {
    // Binary tree to store TokTick Accounts objects
    BinarySearchTree<Account> account_tree = new BinarySearchTree<Account>();
    int option = 0;
   
   
   do {
       // Print out functionality of TokTick App and take input of choice by user

       try {
           Scanner input = new Scanner(System.in);
           System.out.print("Choose an action from the menu:\n1. Find the profile description for a given account\n2. List all accounts\n3. Create an account\n4. Delete an account\n5. Display all posts for a single account\n6. Add a new post for an account\n7. Load a file of actions from disk and process this\n8. Quit\nEnter your choice: ");

           option = input.nextInt();


           if (option == 1) {
               // Find the profile description for a given account

               System.out.print("Enter the account name: ");
               String input_one = input.next();
               input_one += input.nextLine();


               if (account_tree.find(new Account(input_one, null)) == null) {
                   System.out.println("Failure to find matching account name.\n");


               } else {
                   System.out.println("The profile description is: " + (account_tree.find(new Account(input_one, null))).data.getDescription() + "\n");

               }


           } else if (option == 2) {


               // Printing all count names

               if (account_tree.root == null) {

                   System.out.println("No account names to list.\n");

               } else {
                   System.out.println("List of Accounts:\n");
                   account_tree.inOrder();
                   System.out.println("");

               }


           } else if (option == 3) {


               // Creating new account object and insert into Accounts BST

               System.out.print("Input name: ");

               String input_one = input.next();
               input_one += input.nextLine();

               if (account_tree.find(new Account(input_one, null)) != null) {

                   System.out.print("Account Already exits.\n");

               } else {
                   System.out.print("Write description: ");
                   String input_two = input.next();
                   input_two += input.nextLine();


                   Account account = new Account(input_one, input_two);

                   account_tree.insert(account);

                   System.out.println("Account successfully created.\n");


               }


           } else if (option == 4) {
               // Delete Account

               System.out.print("Input name of account to be deleted: ");
               String input_one = input.next();
               input_one += input.nextLine();

               if (account_tree.find(new Account(input_one, null)) == null) {
                   System.out.println("Account could not be found for deletion.\n");

               } else {
                   account_tree.delete(new Account(input_one, null));

                   System.out.println("Account successfully deleted.\n");
               }


           } else if (option == 5) {

               // Display all posts for a single account

               System.out.print("Enter Account name: ");
               String input_one = input.next();
               input_one += input.nextLine();

               if (account_tree.find(new Account(input_one, null)) == null) {
                   System.out.println("Failure to find matching account name.\n");


               } else {
                   // Find Account and list posts
                   BinaryTreeNode<Account> AccFound = account_tree.find(new Account(input_one, null));

                   if (AccFound.data.post_tree.root == null) {

                       System.out.println("No posts for this account.\n");

                   } else {

                       AccFound.data.listPosts();

                   }


               }


           } else if (option == 6) {

               // Adding new post


               System.out.print("Enter Account name to add new post: ");
               String input_one = input.next();
               input_one += input.nextLine();

               // Find Account
               BinaryTreeNode<Account> AccFound = account_tree.find(new Account(input_one, null));

               if (AccFound == null) {
                   System.out.println("No such account exits.\n");
               } else {
                   // Information about post

                   System.out.print("Enter Title of post: ");
                   String input_two = input.next();
                   input_two += input.nextLine();


                   System.out.print("Enter Video: ");
                   String input_three = input.next();
                   input_three += input.nextLine();

                   System.out.print("Enter number of Likes: ");
                   int input_four = input.nextInt();

                   Post post = new Post(input_two, input_three, input_four);

                   // Adds new post
                   AccFound.data.addPost(post);

               }


           } else if (option == 7) {
               // load data file

               try {

                   System.out.print("Enter file name: ");

                   String filename = input.next();

                   File file = new File(filename);
                   Scanner myReader = new Scanner(file);


                   while (myReader.hasNextLine()) {

                       String instruction = myReader.next();


                       String accountName = myReader.next();


                       if (instruction.equals("Create")) {
                           String description = myReader.next();
                           description += myReader.nextLine();


                           Account account = new Account(accountName, description);
                           account_tree.insert(account);


                       }

                       if (instruction.equals("Add")) {
                           String Video = myReader.next();

                           int Likes = myReader.nextInt();


                           String Title = myReader.next();
                           Title += myReader.nextLine();


                           // Find Account
                           BinaryTreeNode<Account> AccFound = account_tree.find(new Account(accountName, null));

                           Post post = new Post(Title, Video, Likes);

                           // Adds new post
                           AccFound.data.addPost(post);


                       }


                   }

                   if (myReader.hasNextLine() == false) {
                       System.out.println("File succefully loaded.\n");

                   }

               } catch (FileNotFoundException e) {
                   System.out.println("File cannot be found.\n");

               }

           } else if (option != 8) {
               System.out.println("Pick a vaild number.\n");

           }
       }catch(java.util.InputMismatchException e)
            {
                System.out.println("Pick a vaild number.\n");
            }

       } while (option != 8);


    System.out.println("\nBye!");

    
    
    
   }
    
    
    
}
