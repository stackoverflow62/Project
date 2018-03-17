package controller;

import java.io.*;
import java.lang.*;
import java.util.*;
import dblibrary.project.csci230.*;
import entity.*;
import interaction.*;
import controller.*;
/** 
 * The Student Functionality Controller class does actions for the student user  
 * 
 * @author Ramon Angeles, Jonathan First, James H. , Jamie Veag, Vue Xiong
 * @version Feb 25, 2018
 */

public class StudentFunctionalityController 
{
  Account stu = new Account(null, null, null, null, 's', 'a');
  UniversityDBLibrary dblib = new UniversityDBLibrary("stacko", "csci230");
  /** 
   * Edits the details of the students account
   * 
   * @param f the first name of the student
   * @param l the last name of the student
   * @param p the password of the student
   */
  public void manageDetails(String f, String l, String p) 
  {
    
//    Scanner scan = new Scanner(System.in);  
//    String u = Account.getUsername();
//    System.out.println("Enter the first name.");
//    String f = scan.next();
//    System.out.println("Enter the last name.");
//    String l = scan.next();
//    System.out.println("Enter the password.");
//    String p = scan.next();
//    char t = 'S';
//    char s = 'A';
    if (confirm())
    {
      
      stu.setFirstname(f);
      stu.setLastname(l);
      stu.setPassword(p);
     
      DatabaseController dbc = new DatabaseController();
      
      if (dbc.editUser(stu))
        System.out.println("The changes have been made.");
      else 
        System.out.println("There was an error editing this user");
    }
    else 
      System.out.println("The changes have been cancelled");
    

  }
  
  /** 
   * Confirms that the user wants to make these changes
   * 
   * @return Returns true or false if the user want to make these changes
   */
  public boolean confirm()
  {
    Scanner scan = new Scanner(System.in);  
    System.out.println("Do you want to confirm these changes? [Y/N]");
    String answer = scan.next();
    scan.close();
    if (answer.equals("Y") || answer.equals("y"))
      return true;
    else 
      return false;
  }
  /**
   * Allows the student to view a save list of universities the student has saved.
   * 
   * @return an ArrayList of universities
   */
  public ArrayList<University> viewSavedUniversities() {
    
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
    /**
   * This allows the user to get the university information.
   * 
   * @param schoolName the name of the school that the user wants the information of
   * 
   * @returns a University entity with the information of the university
   */
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
  
/**
 * Allows the student to remove a school that they have saved.
 * 
 * @param user the username of the student account
 * @param school the name of the univeristy the student wants to remove
 * 
 * @return true if the school was remove, false otherwise
 */
  public boolean removeUniversity(String user, String school){
    University removeUniversity = getUniversity(school);
    if(removeUniversity == null){
      return false;
    }
    ArrayList<String> oldArray = removeUniversity.getEmphases();
    for(int i = 0; i < oldArray.size(); i++){
      dblib.user_removeSchool(school, oldArray.get(i));
    }
    int failed = dblib.university_deleteUniversity(removeUniversity.getUniversityName());
    if(failed != -1){
      return true;
    }
    else
      return false;
  }
}