//Account Controller

import java.io.*;
import java.lang.*;
import java.util.*;
import dblibrary.project.csci230.*;
//import stackoverflow.*;
public class AccountController{
  
  DatabaseController dbc = new DatabaseController();
  public String[][] users = dbc.getUsers();
  private String username;
  Account ac;
  
  /**
   *Login for the user
   *
   *
   **/
  public AccountController(String u, String p){
    login(u, p);
    ac.logIn();
  }
  
   public void login(String u, String p){
    if(verifyAccount(u,p)){
      username = u;
      if(!checkType(u)){
        
      }
    }
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
  public Boolean verifyAccount(String u, String p){
    
    for(int i = 0; i< users.length; i++)
    {
      if(users[i].equals(u)){
        if(users[i][2].equals(p)){return true;}
      }
    }
    return false;
  }
  
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
  
  public void logout()
  {
    ac.logOut();
  }
}
