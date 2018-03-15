import dblibrary.project.csci230.*;
import java.io.*;
import java.util.*;
import entity.*;
import interaction.*;
import controller.*;

public class CMCDriver {

  
  public static void main(String[] args) {

    
    //User enters login information
    System.out.println("Login Credentials");
    System.out.println("Username: john");
    System.out.println("Password: 12345");
    StudentInteraction john = new StudentInteraction("john", "12345");
    System.out.println("its logged in");
    john.login("john", "12345");
    
    //user enters search
    System.out.println("Search citeria user enters.");
    john.search("Bard","New York","Small-city", "Private", 10000, 0.0,0.0,0.0, 32239.0,4000.0,0,0.0,0.0,0,0,0);
    
   // University bard = new University();
    
    //User mangaes their profile
    System.out.println("Change your profile information/");
    john = new StudentInteraction("John","Doe", "12345");
    john.manageProfile("John", "Doe", "12345");
    
    
    //View saved universities
    john.viewSavedUniversities();
    
    john.removeUniversity("John", "Brad");
    
    john.saveUniversity("Brad");
    
    //john.viewUniversityDetails(University university);
    
    john.confirmation();
    
    john.logout();
  
    
    
  }
}
