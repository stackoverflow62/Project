package controller;

import dblibrary.project.csci230.*;
import java.io.*;
import java.util.*;

import entity.*;
import interaction.*;
import controller.*;

/**
 * This class is the Database controller that allows a user to access the database and change things.
 *
 * First version- Ramon Angeles
 * 
 * @author J. Ramon Angeles, James Heidelberger, Jaime Vega, Jonathan First, Vue Xiong
 * @version February 2018
 */

public class SearchController{
  
  UniversityDBLibrary dblib = new UniversityDBLibrary("stacko", "csci230");
//  String universityName;
//  private String state;
//  private String locationType;//Urban, Rural,etc
//  private String control;//whether school is private or public
//  private int numberOfStudents;
//  private double female;//percentage of female students in the university
//  private double satVerbal;
//  private double satMath;
//  private double expenses;
//  private double financialAid;
//  private int numOfApplicants;
//  private double numAdmitted;
//  private double enrolled;
//  private int academicScale;
//  private int socialScale;
//  private int qualityOfLife;
  
  public SearchController()
  {
   //I don't know if I need to add anything here MAKE SURE WE UPDATE OR DELETE THIS COMMENT 
    String message = "SearchController has been created";
  }
  
  /**
   * Allows the user to search for a university, passing in all the search citeria.
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
   * 
   * @returns an ArrayList of universities that fits the search criteria
   */
  public ArrayList<University> search(String universityName, String state, String location, String control, int numberOfStudents, double female, double SATVerbal,
                                      double SATMath, double expenses, double financialAid, int numberOfApplicants, double admitted, double enrolled,
                                      int academicScale, int socialScale, int qualityOfLifeScale){
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
      
    }
    return schoolInfo;
  }
}