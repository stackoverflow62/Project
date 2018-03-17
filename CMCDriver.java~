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
    System.out.println("Change your profile information \n");
    john = new StudentInteraction("John","Doe", "12345");
    john.manageProfile("John", "Doe", "12345");
    
    
    //View saved universities
    john.saveUniversity("Bard");
    
    john.viewSavedUniversities();
    
    john.removeUniversity("John", "Bard");
    
    john.viewSavedUniversities();
    
    //john.viewUniversityDetails(University university);
    
    john.confirmation();
    
    john.logout();
    
    
    //admin enters login information
    System.out.println("Login Credentials");
    System.out.println("Username: nadmin");
    System.out.println("Password: admin");
    AdminInteraction noreen = new AdminInteraction("nadmin", "admin");
    System.out.println("its logged in");
    noreen.login("noreen", "admin");
  
    
    //admin edits a user's information
    System.out.println("Edits John User's information \n");
    noreen.editStudent("juser", "Jon", "Uzer", "uzer", 'a', 'n');
    
    //admin adds a new school
    System.out.println("School citeria admin enters.");
    noreen.addUniversity("Brad","Ohio","Small-city", "Private", 10000, 0.0,0.0,0.0, 32239.0,4000.0,0,0.0,0.0,0,0,0);
    
    //admin edits a school-Ramon
    
    //admin adds a user - James
    System.out.println("Admin creates a new active user");
    noreen.addStudent("Batman", "Adam", "West", "batman", 'a', 'a');
    
    //admin views all users-Jaime
    
    //admin views a school's details-Jonathan
    System.out.println("View school details");
    noreen.viewSchoolDetails("Brad");
    
    //admin deactivates an account-Vue
    noreen.deactivate();
    
    //admin logout-?
    noreen.logout();
  
  
  
  
  }
}
