//adminInteraction.java

package interaction;

import java.util.*;

import entity.*;
import interaction.*;
import controller.*;

/*
 * Class that student will interact with for any methods they need
 * 
 * -->James Heidelberger did initial set-up Feb 26, 2018
 * 
 * @author Ramon Angeles, Jonathan First, James Heidelberger, Jaime Vega, Vue Xiong
 * @Version February 26, 2018
 */
public class adminInteraction
{
  DatabaseController dbc = new DatabaseController();
  AccountController ac;
  public String username;
  public String password;
  /*
   * Begins the login process, calls the Account controller
   */
  public void login()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter username:");
    username = sc.nextLine();
    System.out.println("Enter password:");
    password = sc.nextLine();
   ac = new AccountController(username, password);
   
  }
  /*
   * Calls the edit student function in the Admin Functionality Controller
   */
  public void editStudent()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the username of the account you want to edit.");
    String u = sc.nextLine();
    System.out.println("Enter new First Name:");
    String firstName = sc.nextLine();
    System.out.println("Enter new Last Name:");
    String lastName = sc.nextLine();
    System.out.println("Enter new password:");
    String password = sc.nextLine();
    System.out.println("Enter new type (a or u):");
    char type = sc.next().charAt(0);
    System.out.println("Enter new Status (Y or N):");
    char status = sc.next().charAt(0);
    
    AdminFunctionalityController afc = new AdminFunctionalityController();
    afc.editUser(u, firstName, lastName, password, type, status);
  }
  
  /*
   *Gets any details to add a new university, then calls the addUniversity method in
   * the University Controller
   */
  public void addUniversity()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the University Name:");
    String universityName = sc.nextLine();
    System.out.println("Enter the State:");
    String state = sc.nextLine();
    System.out.println("Enter the University location: (e.g. urban, rural, suburban)");
    String location = sc.nextLine();
    System.out.println("Enter the control of the university (e.g. private, public)");
    String control = sc.nextLine();
    System.out.println("Enter the desired Number of Students");
    int numberOfStudents = Integer.parseInt(sc.nextLine());
    System.out.println("Enter the desired percentage of female students");
    double female = Double.parseDouble(sc.nextLine());
    System.out.println("Enter the SAT Verbal Score");
    double SATVerbal = Double.parseDouble(sc.nextLine());
    System.out.println("Enter the SAT Math Score");
    double SATMath = Double.parseDouble(sc.nextLine());
    System.out.println("Enter the expenses");
    double expenses = Double.parseDouble(sc.nextLine());
    System.out.println("Enter the percentage of students to receive financial aid");
    double financialAid = Double.parseDouble(sc.nextLine());
    System.out.println("Enter the Number of Applicants");
    int numberOfApplicants = Integer.parseInt(sc.nextLine());
    System.out.println("Enter the percentage of applicants admitted");
    double admitted = Double.parseDouble(sc.nextLine());
    System.out.println("Enter the percentage of admitted students who enroll");
    double enrolled = Double.parseDouble(sc.nextLine());
    System.out.println("Enter the academic scale (1-5):");
    int academicScale = Integer.parseInt(sc.nextLine());
    System.out.println("Enter the social scale (1-5):");
    int socialScale = Integer.parseInt(sc.nextLine());
    System.out.println("Enter the Quality of Life (1-5)");
    int qualityOfLifeScale = Integer.parseInt(sc.nextLine());
    
    UniversityController uc = new UniversityController();;
    uc.addUniversity(universityName, state, location, control, numberOfStudents, female, SATVerbal,
                     SATMath, expenses, financialAid, numberOfApplicants, admitted, enrolled,
                     academicScale, socialScale, qualityOfLifeScale);
  }
  
  /*
   * Gets any details to edit a university, then calls the edit university method in the
   * university controller
   */
  public void editUniversity()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the University Name:");
    String universityName = sc.nextLine();
    System.out.println("Enter the State:");
    String state = sc.nextLine();
    System.out.println("Enter the University location: (e.g. urban, rural, suburban)");
    String location = sc.nextLine();
    System.out.println("Enter the control of the university (e.g. private, public)");
    String control = sc.nextLine();
    System.out.println("Enter the desired Number of Students");
    int numberOfStudents = Integer.parseInt(sc.nextLine());
    System.out.println("Enter the desired percentage of female students");
    double female = Double.parseDouble(sc.nextLine());
    System.out.println("Enter the SAT Verbal Score");
    double Satverbal = Double.parseDouble(sc.nextLine());
    System.out.println("Enter the SAT Math Score");
    double Satmath = Double.parseDouble(sc.nextLine());
    System.out.println("Enter the expenses");
    double expenses = Double.parseDouble(sc.nextLine());
    System.out.println("Enter the percentage of students to receive financial aid");
    double financialAid = Double.parseDouble(sc.nextLine());
    System.out.println("Enter the Number of Applicants");
    int numberOfApplicants = Integer.parseInt(sc.nextLine());
    System.out.println("Enter the percentage of applicants admitted");
    double admitted = Double.parseDouble(sc.nextLine());
    System.out.println("Enter the percentage of admitted students who enroll");
    double enrolled = Double.parseDouble(sc.nextLine());
    System.out.println("Enter the academic scale (1-5):");
    int academicScale = Integer.parseInt(sc.nextLine());
    System.out.println("Enter the social scale (1-5):");
    int socialScale = Integer.parseInt(sc.nextLine());
    System.out.println("Enter the Quality of Life (1-5)");
    int qualtiyOfLifeScale = Integer.parseInt(sc.nextLine());
    
    DatabaseController dbc = new DatabaseController();
    University uni = new University(universityName, state, location, control, numberOfStudents, female, Satverbal,
                      Satmath, expenses, financialAid, numberOfApplicants, admitted, enrolled,
                      academicScale, socialScale, qualtiyOfLifeScale);
    dbc.editUniversity(uni);
  }
  
  /*
   * Gets all details to create a new Student, and then calls the addStudent function
   * in the admin functionality controller
   */
  public void addStudent()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter username:");
    String username = sc.nextLine();
    System.out.println("Enter First Name:");
    String firstName = sc.nextLine();
    System.out.println("Enter Last Name:");
    String lastName = sc.nextLine();
    System.out.println("Enter password:");
    String password = sc.nextLine();
    System.out.println("Enter type (a or u):");
    String type = sc.nextLine();
    System.out.println("Enter Status (Y or N):");
    String status = sc.nextLine();
    
    char charType= type.charAt(0);
    char charStatus = status.charAt(0);
    
   Account newUser = new Account(username, firstName, lastName, password, charType, charStatus);
  //  dbc.addUser(firstName, lastName, username, password, charType);
  }
  
  /*
   *calls the get users function in the admin functionality controller 
   */
  public void viewStudents()
  {
   DatabaseController dbc = new DatabaseController();
   dbc.getUsers();
  }
  
  /*
   * calls the view school details method in th university controller
   */
  public void viewSchoolDetails(String school)
  {
   UniversityController uc = new UniversityController();
   University u = uc.getUniversity(school) ;
   uc.viewUniversityDetails(u);
  }
  
  /*
   * Calls the confirmation in the StudentFunctionalityController for confirmation
   * of any changes made
   */
  public boolean confirmation()
  {
    StudentFunctionalityController sfc = new StudentFunctionalityController();
    Scanner sc = new Scanner(System.in);
    System.out.println("Are you sure you want to make these changes?");
    String response = sc.nextLine();
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
   * Begins the logout process, calls the Account controller
   */
  public void logout()
  {
    ac = new AccountController(username, password);
    ac.logout();
  }
  
  /*
   * Begins the process to deactivate a user, calls the Account controller
   */
  public void deactivate()
  {
   AdminFunctionalityController afc = new AdminFunctionalityController();
   afc.deactivate('d');
  }
}