import dblibrary.project.csci230.*;
import java.io.*;
import java.util.*;

/**
 * This class is the Database controller that allows a user to access the database and change things.
 *
 * First version- Ramon Angeles
 * 
 * @author J. Ramon Angeles, James Heidelberger, Jaime Vega, Jonathan First, Vue Xiong
 * @version February 2018
 */

public class DatabaseController{
  
  private UniversityDBLibrary dblib;
 
  
  /**
   * Default Constructor
   */
  public DatabaseController(){
    dblib = new UniversityDBLibrary("stacko", "stacko", "csci230");
  }
  
  
  public boolean addUniversity(University university){
    int addFailed = 0;
    int failed = dblib.university_addUniversity(university.getUniversityName(), university.getUniversityState(), university.getLocationType(), university.getControl(), (int)university.getNumEnrolled(),
                                                university.getFemalePercentage(), university.getSATVerbal(), university.getSATMath(), university.getExpenses(), 
                                                university.getFinancialAid(), university.getNumApplicants(), university.getNumAdmitted(), university.getNumEnrolled(),
                                                university.getAcademicScale (), university.getSocialScale(), university.getQualityOfLife());
    ArrayList<String> addArray = university.getEmphases();
    for(int i=0; i < addArray.size(); i++){
      addFailed = dblib.university_addUniversityEmphasis(university.getUniversityName(), addArray.get(i));
    }
    if(failed != -1 && addFailed != -1){
      return true;
    }
    return false;
  }
  
  public boolean editUniversity(University university){
    String[][] array = dblib.university_getNamesWithEmphases();
    ArrayList<String> oldArray = new ArrayList<String>();
    int updateFailed = 0;
    int failed = dblib.university_editUniversity(university.getUniversityName(), university.getUniversityState(), university.getLocationType(), university.getControl(), (int)university.getNumEnrolled(),
                                                 university.getFemalePercentage(), university.getSATVerbal(), university.getSATMath(), university.getExpenses(), 
                                                 university.getFinancialAid(), university.getNumApplicants(), university.getNumAdmitted(), university.getNumEnrolled(),
                                                 university.getSocialScale(), university.getSocialScale(), university.getQualityOfLife());  
    if(failed != 1){
      return false;
    }
    for(int i =0 ; i < array.length; i++){
      if(array[i][0].equals(university.getUniversityName())){
        oldArray.add(array[i][1]);
      }
    }
    if(oldArray != null){
      for(int i = 0; i < oldArray.size(); i++){
        dblib.university_removeUniversityEmphasis(university.getUniversityName(), oldArray.get(i));
      }
    }
    ArrayList<String> newArray = university.getEmphases();
    for(int i = 0; i < newArray.size(); i++){
      updateFailed = dblib.university_addUniversityEmphasis(university.getUniversityName(), newArray.get(i));
    }
    
    if(updateFailed != -1){
      return true;
    }
    return false;
    
  }
  
  public boolean editUser(Account account){
    int failed = dblib.user_editUser(account.getUsername(), account.getFirstName(), account.getLastName(), account.getPassword(),
                                     account.getType(), account.getStatus());
    if(failed != -1)
      return true;
    else
      return false;    
  }
  
  public boolean saveUniversity(String username, String schoolName){
   int failed = dblib.user_saveSchool(username, schoolName);
   if(failed != -1)
     return true;
   return false;
  }
 
  public String[][] getUsers()
  {
    return dblib.user_getUsers();
  }
  
  public boolean deleteUniversity(String name){
    University deleteUniversity = getUniversity(name);
    if(deleteUniversity == null){
      return false;
    }
    ArrayList<String> oldArray = deleteUniversity.getEmphases();
    for(int i = 0; i < oldArray.size(); i++){
      dblib.university_removeUniversityEmphasis(deleteUniversity.getUniversityName(), oldArray.get(i));
    }
    int failed = dblib.university_deleteUniversity(deleteUniversity.getUniversityName());
    if(failed != -1){
      return true;
    }
    else
      return false;
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

