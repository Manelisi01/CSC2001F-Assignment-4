# CSC2001F-Assignment-4

TIktok is a very popular social media application centred on the creation and sharing of video clips.  In March 2023, the application came under scrutiny because of political reasons and the US government threatened to ban its use.  If this happens, it is very likely that programmers will scramble to create similar applications to fill the void.

The goal of this assignment is to produce a simple proof-of-concept replica of some functionality of a social media system like TIktok, using Binary Search Trees as the main underlying data structure.  We assume for this assignment that data is stored in memory while the application performs multiple functions on-demand until the user exits.
Application

In your application, every user has a record with 3 data fields: account, profile description and an associated list of posts (most recent first).  A post has at least a title, name of video clip file and number of likes.

Your application must include at least the functionality to do the following:

    Find the profile description for a given account
    List all accounts (in any order)
    Create an account
    Delete an account
    Display all posts for a single account (with newest posts first)
    Add a new post for an account
    Load a file of actions from disk and process this in sequence.  These are only Create and Add actions.

You MUST use a Binary Search Tree (BST; balanced or not balanced) to implement the data structure for storing accounts.  Your BST implementation can be created from scratch or re-used from anywhere.

You may use any user interface for the application - at least a text menu is required but the interface can be graphical or GUI-based.  For example:

Choose an action from the menu:
1. Find the profile description for a given account
2. List all accounts
3. Create an account
4. Delete an account
5. Display all posts for a single account
6. Add a new post for an account
7. Load a file of actions from disk and process this
8. Quit
Enter your choice: 1

Enter the account name: shouzichew
The profile description is: Shou Zi Chew is the CEO of TIktok.

Choose an action from the menu:
1. Find the profile description for a given account
2. List all accounts
3. Create an account
4. Delete an account
5. Display all posts for a single account
6. Add a new post for an account
7. Load a file of actions from disk and process this
8. Quit
Enter your choice: 5

Enter the account name: shouzichew
Title: More cats playing with wool
Video: video2.mpg
Number of likes: 75
Title: Cats playing with wool
Video: video1.mpg
Number of likes: 34

Choose an action from the menu:
1. Find the profile description for a given account
2. List all accounts
3. Create an account
4. Delete an account
5. Display all posts for a single account
6. Add a new post for an account
7. Load a file of actions from disk and process this
8. Quit
Enter your choice: 8

Bye!  

You should be able to invoke your application using a command such as:

java -cp bin TokTik

Test your program thoroughly and ensure that it functions correctly for different inputs.  Also, output error messages where appropriate (e.g., when a Find action fails to find a matching account name). 

Hint: Do this assignment incrementally.  First create a data structure with only account names and descriptions and get the related functions working one at a time.  Then add in the functions related to posts.  Finally, write the code to load in the external file. 
Dataset for file loading

The function to load actions from disk must process a file with lines such as the following:

Create hussein The lecturer dude.
Add hussein video34.mpg 34 Yet another video of cats
Add hussein video45.mpg 53 Omg more video of cats
