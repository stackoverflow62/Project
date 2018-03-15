
import java.io.*;
import java.lang.*;
import java.util.*;
import dblibrary.project.csci230.*;
//import stackoverflow.*;
public class UniversityController{
  
  
  private UniversityDBLibrary dblib;
  
  /**
   * recieve the University that will be added to the database
   * pre: university that is added should not already exist
   * @param u university that will be added
   * @throws IllegalArgumentException is the preconditions are not met
   */
  
  public void addUniversity(String schoolName, String state, String location, String control, int numStudents,
                            double female, double satVerb, double satMath, double expenses, double finAid, int numApplicants,
                            double numAdmitted, double numEnrolled, int acaScale, int socScale, int qualityLife){
    University ad = new University(schoolName, state, location, control, numStudents,
                                   female, satVerb, satMath, expenses, finAid, numApplicants,
                                   numAdmitted, numEnrolled, acaScale, socScale, qualityLife);
    
  }
  public ArrayList<University> getSavedUniversities() {
    
    ArrayList<University> schoolInfo = new ArrayList<University>();
    String[][] school = dblib.university_getUniversities();
    String[][] empArr = dblib.university_getNamesWithEmphases();
    for(int i =0 ; i < school.length; i++){
      ArrayList<String> emphases = new ArrayList<String>();
      for(int j = 0; j < empArr.length; j++){
        if(empArr[j][0].equals(school[i][0])){
          emphases.add(empArr[j][1]);
        }
      }
      University university = new University(school[i][0],school[i][1],school[i][2],school[i][3],Integer.parseInt(school[i][4]),
                                             Double.parseDouble(school[i][5]),Double.parseDouble(school[i][6]),Double.parseDouble(school[i][7]),
                                             Double.parseDouble(school[i][8]),Double.parseDouble(school[i][9]),Integer.parseInt(school[i][10]),
                                             Double.parseDouble(school[i][11]),Double.parseDouble(school[i][12]),Integer.parseInt(school[i][13]),
                                             Integer.parseInt(school[i][14]),Integer.parseInt(school[i][15]));
      schoolInfo.add(university);
    }
    return schoolInfo;
  }
  
  public void addUser(String firstName, String lastName, String username, String password,char type){
    dblib.user_addUser(username, firstName, lastName, password, type);
  }
  
  /**
   * make changes to a university within the database
   * 
   * pre: university must exist in the database
   * @param u the universit that will be modified
   * @throws IllegalArgumentException if the preconditions are not met
   */
//  public void editUniveristy(String u){
//
//  }
  /**
   * view the details for a university
   * 
   * pre: university must exist in the database
   * @param u the university that will be viewed
   * @throws IllegalArgumentException if the preconditions are not met
   * 
   */
  public void viewUniversityDetails(University u)
  {
    u.getUniversityName();
    u.getUniversityState();
    u.getLocationType();
    u.getControl();
    u.getNumOfStudents();
    u.getFemalePercentage();
    u.getSATVerbal();
    u.getSATMath();
    u.getExpenses();
    u.getFinancialAid();
    u.getNumApplicants();
    u.getNumAdmitted();
    u.getNumEnrolled();
    u.getAcademicScale();
    u.getSocialScale();
    u.getQualityOfLife();
    u.getEmphases();
    
  }
  
 public University getUniversity(String schoolName){
      ArrayList<String> emphases = new ArrayList<String>();
      String[][] arr = dblib.university_getNamesWithEmphases();
      String[][] school = dblib.university_getUniversities();
      University university = null;
      
      for(int i =0 ; i < arr.length; i++){
        if(arr[i][0].equals(schoolName)){
          emphases.add(arr[i][1]);
        }
      }  
      for(int i =0 ; i< school.length ; i++){
        if(school[i][0].equals(schoolName)){
          for(int j = 0; j < school[i].length; j++){
            university = new University(school[i][0],school[i][1],school[i][2],school[i][3],Integer.parseInt(school[i][4]),
                                        Double.parseDouble(school[i][5]),Double.parseDouble(school[i][6]),Double.parseDouble(school[i][7]),
                                        Double.parseDouble(school[i][8]),Double.parseDouble(school[i][9]),Integer.parseInt(school[i][10]),
                                        Double.parseDouble(school[i][11]),Double.parseDouble(school[i][12]),Integer.parseInt(school[i][13]),
                                        Integer.parseInt(school[i][14]),Integer.parseInt(school[i][15]));
          }
        }
      }
      return university;
    }
  
}

