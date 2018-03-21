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
public class AdminInteraction
{
  DatabaseController dbc = new DatabaseController();
  public String[][] students = dbc.getUsers();
  
  AccountController ac;
  public String username;
  public String password;
  
  /*
   * Constructor for the Student Interaction
   * 
   * @param username the username the user has supplied
   * @param password the password the user has supplied
   */
  public AdminInteraction(String username, String password)
  {
    this.username = username;
    this.password = password;
  }
  /*
   * Begins the login process, calls the Account controller
   * 
   * @param username the username of a user
   * @param password the password associated with the user
   */
  public void login(String username, String password)
  {
    
   ac = new AccountController(username, password);
   
  }
  /*
   * Calls the edit student function in the Admin Functionality Controller
   * 
   * @param username the username of a user
   * @param firstName the first name of the user
   * @param lastName the last name of the user
   * @param password the password associated with the user
   * @param type the type of account the user is whether admin or student
   * @param status the status of the user, active or deactivated
   */
  public void editStudent(String firstName, String lastName, String username,  String password, char type, char status)
  {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the username of the account you want to edit.");
//    String u = sc.nextLine();
//    System.out.println("Enter new First Name:");
//    String firstName = sc.nextLine();
//    System.out.println("Enter new Last Name:");
//    String lastName = sc.nextLine();
//    System.out.println("Enter new password:");
//    String password = sc.nextLine();
//    System.out.println("Enter new type (a or u):");
//    char type = sc.next().charAt(0);
//    System.out.println("Enter new Status (Y or N):");
//    char status = sc.next().charAt(0);
    
    AdminFunctionalityController afc = new AdminFunctionalityController();
    afc.editUser(username, firstName, lastName, password, type, status);
  }
  
  /*
   *Gets any details to add a new university, then calls the addUniversity method in
   * the University Controller
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
  public void addUniversity (String universityName, String state, String location, String control, int numberOfStudents, double female, double SATVerbal,
                                      double SATMath, double expenses, double financialAid, int numberOfApplicants, double admitted, double enrolled,
                                      int academicScale, int socialScale, int qualityOfLifeScale)
  {
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
//    
    UniversityController uc = new UniversityController();;
    uc.addUniversity(universityName, state, location, control, numberOfStudents, female, SATVerbal,
                     SATMath, expenses, financialAid, numberOfApplicants, admitted, enrolled,
                     academicScale, socialScale, qualityOfLifeScale);
  }
  
  /*
   * Gets any details to edit a university, then calls the edit university method in the
   * university controller
   */
  public void editUniversity(String universityName, String state, String location, String control, int numberOfStudents, double female, double SATVerbal,
                                      double SATMath, double expenses, double financialAid, int numberOfApplicants, double admitted, double enrolled,
                                      int academicScale, int socialScale, int qualityOfLifeScale)
  {
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
//    double satVerbal = Double.parseDouble(sc.nextLine());
//    System.out.println("Enter the SAT Math Score");
//    double satMath = Double.parseDouble(sc.nextLine());
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
//    int qualtiyOfLifeScale = Integer.parseInt(sc.nextLine());
    
    DatabaseController dbc = new DatabaseController();
    University uni = new University(universityName, state, location, control, numberOfStudents, female, SATVerbal,
                      SATMath, expenses, financialAid, numberOfApplicants, admitted, enrolled,
                      academicScale, socialScale, qualityOfLifeScale);
    dbc.editUniversity(uni);
  }
  
  /*
   * Gets all details to create a new Student, and then calls the addStudent function
   * in the admin functionality controller
   */
  public void addStudent(String firstName, String lastName, String username, String password, char charType, char status)
  {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter username:");
//    String username = sc.nextLine();
//    System.out.println("Enter First Name:");
//    String firstName = sc.nextLine();
//    System.out.println("Enter Last Name:");
//    String lastName = sc.nextLine();
//    System.out.println("Enter password:");
//    String password = sc.nextLine();
//    System.out.println("Enter type (a or u):");
//    String type = sc.nextLine();
//    System.out.println("Enter Status (Y or N):");
//    String status = sc.nextLine();
//    
//    char charType= type.charAt(0);
//    char charStatus = status.charAt(0);
//    
   Account newUser = new Account(firstName, lastName, username, password,  charType, status);
   //                         String userName,String password, String firstName, String lastName, char type, char status
   if(dbc.addUser(firstName, lastName, username, password, charType)){
     System.out.println("User " + firstName + " succesfully added");
   }
   else
     System.out.println("User " + firstName + " was not added");
   
  }
  
  /*
   *calls the get users function in the admin functionality controller 
   */
  public void viewStudents()
  {
   //DatabaseController dbc = new DatabaseController();
    
   
   for(int i = 0; i < students.length; i++){
     System.out.println(students[i][0] + " " + students[i][1]);
   }
   
  }
  
  /*
   * calls the view school details method in th university controller
   * 
   * @param school the name of the school that the student wants to look at
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
  public void deactivate(Account a)
  {
   AdminFunctionalityController afc = new AdminFunctionalityController();
   afc.deactivate(a);
  }
  
  public Account findStudent(String studentName){
    Account temp =null;
    for(int i = 0; i < students.length; i++){
      //System.out.println(students[i][0] + " " + students[i][1]+ " " +  students[i][2]+ " " +  students[i][3]+ " " +  students[i][4]+ " " +  students[i][5]);
      if (students[i][2].equals(studentName)){
        //String userName,String password, String firstName, String lastName, char type, char status
        String status = students[i][5];
        String type = students[i][4];
        temp = new Account(students[i][2], students[i][3], students[i][0], students[i][1], type.charAt(0), status.charAt(0));
        
      }
   }
    //System.out.println(temp);
    return temp;
  }
}