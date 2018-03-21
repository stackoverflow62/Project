package driver;

import interaction.*;

public class CMCDriver {

  
  public static void main(String[] args) {
	
	System.out.println("Login Section");
	
	//Alternative Scenario: Bad Password
	StudentInteraction john = new StudentInteraction("juser", "12345");
	//System.out.println("its logged in");
	john.login("juser", "1234");
	
	//Alternative Scenario: Use is inactive
	StudentInteraction lynn = new StudentInteraction("luser", "user");
	lynn.login("luser", "user");
	
    //Main Scenario: User enters correct login information
    StudentInteraction john1 = new StudentInteraction("juser", "12345");
    //System.out.println("its logged in");
    john1.login("juser", "12345");
    
    
    //user enters search
    System.out.println("Search citeria user enters.");
    System.out.println("Top 5 schools matching search:");
    john.search("AUBURN", "ALABAMA", "SMALL-CITY", "STATE", "35000", "21", "480", "545", "12468", "50", "5500", "90", "60", "2", "4", "4");
    System.out.println("");
   // University bard = new University();
    
    //User manages their profile
    System.out.println("Change your profile information \n");
    //john = new StudentInteraction("John","Doe", "12345");
    john.manageProfile("juser","John", "Doe", "12345");
    System.out.println("");
    
    //View saved universities
    john.saveUniversity("juser","BARNARD");
    
    john.viewSavedUniversities("juser");
    
    john.removeUniversity("John", "BARD");
    
    //john.viewSavedUniversities();
    System.out.println("");
    //john.viewUniversityDetails(University university);
    
    //john.confirmation();
    
    john.logout("John");
    System.out.println("");
    
    //admin enters login information
    System.out.println("Login Credentials");
    System.out.println("Username: nadmin");
    System.out.println("Password: admin");
    AdminInteraction noreen = new AdminInteraction("nadmin", "admin");
    System.out.println("its logged in");
    noreen.login("noreen", "admin");
    noreen.addStudent("John", "User", "juser", "password", 'a', 'Y');
    System.out.println("");
  //admin views all schools
    System.out.println("Admin views all the schools");
    noreen.viewUniversites();
    //admin edits a user's information
    System.out.println("Edits John User's information \n");
    noreen.editStudent("juser", "Jon", "Uzer", "password", 'a', 'Y');
    System.out.println("");
    
    //admin adds a new school
    System.out.println("School citeria admin enters.");
    noreen.addUniversity("BARD","Ohio","Small-city", "Private", 10000, 0.0,0.0,0.0, 32239.0,4000.0,0,0.0,0.0,0,0,0);
    noreen.addUniversity("CSB","MN","Small-city", "Private", 10000, 0.0,0.0,0.0, 32239.0,4000.0,0,0.0,0.0,0,2,0);
    System.out.println("");
    
    //admin edits a school-Ramon
    noreen.editUniversity("CSB","MN","Small-city", "Private", 5000, 100,10,20.0, 32239.0,4000.0,40,50.0,60.0,2,3,2);
    System.out.println("");
    
    //admin adds a user - James
    System.out.println("Admin creates a new active user");
    noreen.addStudent( "Adam", "West", "Batman", "password", 'a', 'Y');
    System.out.println("");
    
    
    
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
