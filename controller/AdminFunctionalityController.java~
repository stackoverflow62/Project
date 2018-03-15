import java.io.*;
import java.lang.*;
import java.util.*;
import dblibrary.project.csci230.*;

/** 
 * User Functionality Controller that the user can you to do actions 
 * 
 * @author Ramon Angeles, Jonathan First, James H. , Jamie Veag, Vue Xiong
 * @version Feb 25, 2018
 */

public class AdminFunctionalityController 
{
   public Account stu;
  /**
   * Edits student account information
   */
  public void editUser(String u, String f, String l, String p, char t, char s)
  {
//    Scanner scan = new Scanner(System.in);  
//    System.out.println("Enter the username of the account you want to edit.");
//    String u = scan.next();
//    System.out.println("Enter the first name.");
//    String f = scan.next();
//    System.out.println("Enter the last name.");
//    String l = scan.next();
//    System.out.println("Enter the password.");
//    String p = scan.next();
//    System.out.println("Enter the type. [A/S]" );
//    char t = scan.next().charAt(0);
//    System.out.println("Enter the status of the account. [A/D]");
//    char s = scan.next().charAt(0);
    if (confirm())
    {
      DatabaseController dbc = new DatabaseController();
      stu = new Account(u, f, l, p, t, s);
      if (dbc.editUser(stu))
        System.out.println("The changes have been made.");
      else 
        System.out.println("There was an error editing this user");
    }
    else 
      System.out.println("The changes have been cancelled");
    
//    scan.close();
  }
  
  public void deactivate(char s)
  {
    if (confirm())
    {
      stu.setStatus(s);
    }
    else 
      System.out.println("The changes have been cancelled");
  }
  
  /** 
   * Confirms that the Admin wants to make the changes
   * 
   * @return Returns true or false if the Admin wants to make the changes
   */
  public boolean confirm()
  {
    Scanner scan = new Scanner(System.in);  
    System.out.println("Do you want to confirm these changes? [Y/N]");
    String answer = scan.next();
    scan.close();
    if (answer.equals("Y") || answer.equals("y"))
      return true;
    else 
    {
      System.out.println("The changes have been cancelled.");
      return false;
    }
  }
    
}