package entity;

/**
 * Student Entity that stores the information for a student instance. 
 * 
 * 
 * 
 * From 2/25/18-2/26/18-->worked on by Vue Xiong
 * -->wrote the variables, the constructor and setter method
 * @author Ramon Angeles, Jonathan First, James H. , Jaime Vega, Vue Xiong
 * @version Feb 26, 2018
 */

public class Student
{
  private String userName;
  private String password;
  private char status;
  /**
  * Constructor, creates a new student with a username and password. 
  * Also sets the accoutn status of a user
  * 
  * @param userName a unique username for a new user
  * @param password a unique password that belongs to a user
  * @param status the status of a user whether they are activer or not
  */
  public Student(String userName, String password, char status)
  {
    this.userName = userName;
    this.password = password;
    this.status = status;
  }
  ///****Allows for the Admin to set the user's account to active or deactivates a user's account***********
  /**
   * Allows Admin to set status of user account
   * 
   * @param status the status of a user
   */
  public boolean setAccountStatus(char status)
  {
	  this.status = status;
	  return true;
  }
  
  /**
   * Allows the user to get a username
   */
  public String getUserName()
  {
    return this.userName;
  }
  
  
  /**
   * Allows user to cahnge their password
   * 
   * @param password the password of the user
   */
  public boolean setPassword(String password)
  {
	  this.password = password;
	  return true;
  }
  
}
