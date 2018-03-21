package controller;

import java.util.*;
import entity.*;

/** 
 * User Functionality Controller that the user can you to do actions 
 * 
 * @author Ramon Angeles, Jonathan First, James H. , Jaime Vega, Vue Xiong
 * @version Feb 25, 2018
 */

public class AdminFunctionalityController 
{
   public Account stu;
  /**
   * Edits student account information
   * 
   * @param u the username
   * @param f the user's first name
   * @param l the user's last name
   * @param p the user's password
   * @param t the type of user, whether student or admin
   * @param s the status of the user or admin, whether they are active or not
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
    if (true)//bananas
    {
      DatabaseController dbc = new DatabaseController();
      stu = new Account(u, f, l, p, t, s);
      if (dbc.editUser(stu))
        System.out.println("The changes have been made.");
      else 
        System.out.println("There was an error editing this user");
    }
    //else 
      //System.out.println("The changes have been cancelled");
    
//    scan.close();
  }
  /**
   * To deactivate a user's account.If decide not to then cancel the change.
   * 
   * @param s the status of the user
   */
  public void deactivate(Account a)
  {
    stu = a;
    if (true)//bananas
    {
      stu.setStatus('N');
      DatabaseController dbc = new DatabaseController();
      if (dbc.editUser(stu))
        System.out.println("The changes have been made.");
      else 
        System.out.println("There was an error editing this user");
    }
    //else 
      //System.out.println("The changes have been cancelled");
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