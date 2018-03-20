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
    System.out.println("Top 5 schools matching search:");
    john.search("AUBURN", "ALABAMA", "SMALL-CITY", "STATE", "35000", "21", "480", "545", "12468", "50", "5500", "90", "60", "2", "4", "4");
    System.out.println("");
   // University bard = new University();
    
    //User mangaes their profile
    System.out.println("Change your profile information \n");
    john = new StudentInteraction("John","Doe", "12345");
    john.manageProfile("John", "Doe", "12345");
    System.out.println("");
    
    //View saved universities
    john.saveUniversity("BARD");
    
    john.viewSavedUniversities();
    
    john.removeUniversity("John", "BARD");
    
    john.viewSavedUniversities();
    System.out.println("");
    //john.viewUniversityDetails(University university);
    
    john.confirmation();
    
    john.logout("John");
    System.out.println("");
    
    //admin enters login information
    System.out.println("Login Credentials");
    System.out.println("Username: nadmin");
    System.out.println("Password: admin");
    AdminInteraction noreen = new AdminInteraction("nadmin", "admin");
    System.out.println("its logged in");
    noreen.login("noreen", "admin");
    noreen.addStudent("John", "User", "juser", "password", 'a', 'N');
    System.out.println("");
    
    //admin edits a user's information
    System.out.println("Edits John User's information \n");
    noreen.editStudent("Jon", "Uzer", "juser", "password", 'a', 'N');
    System.out.println("");
    
    //admin adds a new school
    System.out.println("School citeria admin enters.");
    noreen.addUniversity("BARD","Ohio","Small-city", "Private", 10000, 0.0,0.0,0.0, 32239.0,4000.0,0,0.0,0.0,0,0,0);
    noreen.addUniversity("CSB","MN","Small-city", "Private", 10000, 0.0,0.0,0.0, 32239.0,4000.0,0,0.0,0.0,0,0,0);
    System.out.println("");
    
    //admin edits a school-Ramon
    noreen.editUniversity();
    System.out.println("");
    
    //admin adds a user - James
    System.out.println("Admin creates a new active user");
    noreen.addStudent( "Adam", "West", "Batman", "password", 'a', 'Y');
    System.out.println("");
    
    //String username, String firstName, String lastName, String password, char charType, char status

    //admin views all users(students?)-Jaime
    System.out.println("Admin Views all users: ");
    noreen.viewStudents();
    System.out.println("");
    
    //admin views a school's details-Jonathan
    System.out.println("View school details: ");    
    noreen.viewSchoolDetails("BROWN");
    System.out.println("");
    
    
    //admin deactivates an account-Vue
    System.out.println("Deactivate account ");
    noreen.deactivate(noreen.findStudent("Batman"));
    System.out.println("");
    
        
    //admin logout-?
    System.out.println("Admin has been logged out");
    noreen.logout();
  
  
  
  
  }
}
