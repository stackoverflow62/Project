//studentInteraction.java
package interaction;
import java.util.ArrayList;
import java.util.Scanner;

import controller.AccountController;
import controller.DatabaseController;
import controller.SearchController;
import controller.StudentFunctionalityController;
import controller.UniversityController;
import entity.University;

/*
 * Class that user will interact with for any methods they need
 * 
 * -->James Heidelberger did initial set-up Feb 26, 2018
 * 
 * @author Ramon Angeles, Jonathan First, James Heidelberger, Jaime Vega, Vue Xiong
 * @Version February 26, 2018
 */
public class StudentInteraction
{
  StudentFunctionalityController sfc = new StudentFunctionalityController();
  DatabaseController dbc = new DatabaseController();
  UniversityController uc = new UniversityController();
  AccountController ac;
  public String username;
  public String firstName;
  public String lastName;
  public String password;
  
  /**
   * Constructors that creates a student interaction with username and password.
   * 
   * @param username the username of the student
   * @param password the password associated with the username
   */
  public StudentInteraction(String username, String password)
  {
    this.username = username;
    this.password = password;
  }
  /**
   * Constructor that creates a studentInteraction with first,last, and password
   * 
   * @param firstName the firstname of the student
   * @param lastName the last name of the student
   * @param password the password associated with the account
   */
  public StudentInteraction(String firstName, String lastName, String password)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
    
  }
  /*
   * Will get input from the users off of the criteria they are searching for in
   *      a university, and then will pass the info to the searchController.
   * 
   * @param universityName the name of the university 
   * @param state the state the university is located in 
   * @param location whether is rural, urban or city
   * @param control whether the school is public or private
   * @param numberOfStudents the number of students at the school
   * @param female the percentage of female students at the school
   * @param SATVerbal the SAT verbal score at the school
   * @param SATMath the SAT math score at the school
   * @param expenses the cost to attend the school
   * @param financialAid the financial aid the school offers for students
   * @param numberOfApplicants the number of students who applied to the school
   * @param admitted the number of students admitted to the school
   * @param enrolled the number of students enrolled at the school
   * @param academicScale the school's academic rating
   * @param socialScale the school's social rating
   * @param qualityOfLifeScale the school's quality of life for students
   */
  public void search(String universityName, String state, String location, String control, String numberOfStudents, String female, String satVerbal,
                     String satMath, String expenses, String financialAid, String numberOfApplicants, String admitted, String enrolled,
                     String academicScale, String socialScale, String qualityOfLifeScale)
  {
    ArrayList<String> results = new ArrayList<String>();
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the University Name:");
//    String universityName = sc.nextLine();
//    System.out.println("Enter the State:");
//    String state = sc.nextLine();
//    System.out.println("Enter the University location: (e.g. urban, rural, suburban)");
//    String location = sc.nextLine();
//    System.out.println("Enter the control of the university (e.g. private, public)");
//    String control = sc.nextLine();
//    System.out.println("Enter the desired Number of Students");
//    int numberOfStudents = Integer.parseInt(sc.nextLine());
//    System.out.println("Enter the desired percentage of female students");
//    double female = Double.parseDouble(sc.nextLine());
//    System.out.println("Enter the SAT Verbal Score");
//    double SATVerbal = Double.parseDouble(sc.nextLine());
//    System.out.println("Enter the SAT Math Score");
//    double SATMath = Double.parseDouble(sc.nextLine());
//    System.out.println("Enter the expenses");
//    double expenses = Double.parseDouble(sc.nextLine());
//    System.out.println("Enter the percentage of students to receive financial aid");
//    double financialAid = Double.parseDouble(sc.nextLine());
//    System.out.println("Enter the Number of Applicants");
//    int numberOfApplicants = Integer.parseInt(sc.nextLine());
//    System.out.println("Enter the percentage of applicants admitted");
//    double admitted = Double.parseDouble(sc.nextLine());
//    System.out.println("Enter the percentage of admitted students who enroll");
//    double enrolled = Double.parseDouble(sc.nextLine());
//    System.out.println("Enter the academic scale (1-5):");
//    int academicScale = Integer.parseInt(sc.nextLine());
//    System.out.println("Enter the social scale (1-5):");
//    int socialScale = Integer.parseInt(sc.nextLine());
//    System.out.println("Enter the Quality of Life (1-5)");
//    int qualityOfLifeScale = Integer.parseInt(sc.nextLine());
    
    SearchController searchController = new SearchController();;
    results = searchController.search(universityName, state, location, control, numberOfStudents, female, satVerbal,
                                      satMath, expenses, financialAid, numberOfApplicants, admitted, enrolled,
                                      academicScale, socialScale, qualityOfLifeScale);
    for(String s : results)
    {
      System.out.println(s);
    }
  }
  
  /*
   * Calls the manageProfile method in the studentFunctionalityController
   * 
   * @param firstName the firstname of the student
   * @param lastName the last name of the student
   * @param password the password associated with the account
   */
  public void manageProfile(String username, String firstName, String lastName,String password)
  {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter new First Name:");
//    String firstName = sc.nextLine();
//    System.out.println("Enter new Last Name:");
//    String lastName = sc.nextLine();
//    System.out.println("Enter new password:");
//    String password = sc.nextLine();
    
    StudentFunctionalityController sfc = new StudentFunctionalityController();
    sfc.manageDetails(username, firstName, lastName, password);
    
  }
  
  /*
   * Calls the viewSavedUniversitys method in the StudentFunctionalityController
   */
  public void viewSavedUniversities(String username)
  {
    sfc.viewSavedUniversities(username);
  }
  
  /*
   * Calls the removeUniversity method in the StudentFunctionalityController
   * 
   * @param username the username of the student
   * @param school A university object to remove from the saved university list
   */
  public void removeUniversity(String username, String school)
  {
    sfc.removeUniversity(username, school); 
  }
  
  /*
   * Calls the saveUniversity method in the StudentFunctionalityController
   * 
   * @param university A university object to add to the saved university list
   */
  public void saveUniversity (String userName,String university)
  {
    
    sfc.saveUniversity(userName,university);
  }
  
  /*
   * Calls the viewUniversityDetails in the StudentFunctionalityController
   * 
   * @param university A university object to view the associated details
   */
  public void viewUniversityDetails(University university)
  {
    
	  UniversityController uc = new UniversityController();
	  University u = uc.getUniversity(university.getUniversityName());
	  uc.viewUniversityDetails(u, dbc.getEmphasis(university.getUniversityName()));
  }
  
  /*
   * Calls the confirmation in the StudentFunctionalityController for confirmation
   * of any changes made
   */
  public boolean confirmation()
  {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Are you sure you want to make these changes?");
    
    String response = sc.nextLine();
    sc.nextLine();
    sc.close();
    if (response.equals("Yes") || response.equals("yes") || response.equals("Y") || response.equals("y"))
    {
      return true;
    }
    else if (response.equals("No") || response.equals("no") || response.equals("N") || response.equals("n"))
    {
      return false; 
    }
    else
    {
      System.out.println("Please enter a valid response (y or n) \n");
      this.confirmation();
    }
    
    return false;
  }
  
  /*
   * Begins the login process, calls the Account controller
   * 
   * @param username the username of the student
   * @param password the password associated with the account
   */
  public void login(String username, String password)
  {
   ac = new AccountController (username);
   //System.out.println("Here3");
   boolean loggedOn = ac.login(username, password);
   //System.out.println("Here4");
   if (loggedOn)
   {
     System.out.println("Logged In Successfully");
   }
  }
  
  /*
   * Begins the logout process, calls the Account controller
   */
  public void logout(String username)
  {
    ac = new AccountController(username);
    ac.logout();
  }
  
  public void recommendedSchools()
  {
	  University u = new University("AUBURN", "ALABAMA", "SMALL-CITY", "STATE", 35000, 21, 480, 545, 12468, 50, 5500, 90, 60, 2, 4, 4);  
      dbc.getRecommendedSchools(u);
  }
  
  
  
}