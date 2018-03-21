//Account Controller
package controller;

import entity.*;

//import stackoverflow.*;
public class AccountController{
  
  DatabaseController dbc = new DatabaseController();
  public String[][] users = dbc.getUsers();
  private String username;
  private String password;
  Account ac;
  
  /**
   <<<<<<< HEAD
   * Login for the user
   =======
   * Constructor for the account controller
   * 
   * @param username the username provided by the user
   */
  public AccountController(String username)
  {
    this.username = username; 
  }
  
  /**
   *Login for the user
   >>>>>>> f80f5645bffe9fc4305a592502ab0a898df18e25
   *
   * @param u the username of the user
   * @param p the password of the user
   *
   **/
  public AccountController(String u, String p){
    this.username = u;
    this.password = p;    
    //   ac = new Account(u, p);
  }
  
  /**
   * Logs the user in
   * 
   * @param u the username of the user
   * @param p the password of the user
   */
  public boolean login(String u, String p){
    boolean loggedOn = false;
    boolean isActive = dbc.login(u, p);
    //System.out.println("Here!");
    ac = new Account(u, p);
    if (isActive)
    {
      loggedOn = ac.login();
      if (loggedOn)
      {
        return loggedOn; 
      }
      else
      {
        throw new  SecurityException ("Cannot log on twice");
      }
    }
    //System.out.println("Here2!");
    return isActive;
  }  
  /**
   * Check the type of user that is logged in Student/Admin
   *
   *@returns returns the type of user
   *
   **/
  public Boolean checkType(String u){
    for(int i = 0; i< users.length; i++)
    {
      if(users[i].equals(u)){
        if(users[i][4].equals("a")){return true;}
      }
    }
    return false;
  }
  /**
   * Verifies that the account credentials are valid by comparing them to
   * a database of accounts
   *
   *@param u username given by user
   *@param p password given by user
   *
   *@returns true if the account was able to be verified, otherwise false
   **/
//  public Boolean verifyAccount(String u, String p){
//    
//    for(int i = 0; i< users.length; i++)
//    {
//      if(users[i].equals(u)){
//        if(users[i][2].equals(p)){return true;}
//      }
//    }
//    return false;
//  }
  
  /**
   * Check to see if the user account is active
   *
   *@returns true if the account is active, otherwise false
   **/
  public Boolean activeUser(String u){
    for(int i = 0; i< users.length; i++)
    {
      if(users[i].equals(u)){
        if(users[i][5].equals("Y")){return true;}
      }
    }
    return false;
  }
  /**
   * Logs the user out of their account  
   */
  public void logout()
  {
    ac = new Account(username, password);
    ac.logOut();
  }
}
