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
  public ArrayList<String> search(String universityName, String state, String location, String control, String numberOfStudents, String female, String satVerbal,
                                  String satMath, String expenses, String financialAid, String numberOfApplicants, String admitted, String enrolled,
                                  String academicScale, String socialScale, String qualityOfLifeScale){
    ArrayList<String> schoolInfo = new ArrayList<String>();
    
    String[][] school = dblib.university_getUniversities();
    String[][] results = new String[school.length][2];
    String[][] printr = new String[school.length][2];
    Integer count;
    //String[][] empArr = dblib.university_getNamesWithEmphases();
    for(int i =0 ; i < school.length; i++)
    {
      count = 0;
      for(int j = 0; j < 16; j++)
      {
        if(school[i][j].equals(universityName))
        {
          count++;
        }
        if(school[i][j].equals(state))
        {
          count++;
        }
        if(school[i][j].equals(location))
        {
          count++;
        }
        
        if(school[i][j].equals(control))
        {
          count++;
        }
        if(school[i][j].equals(numberOfStudents))
        {
          count++;
        }
        if(school[i][j].equals(female))
        {
          count++;
        }
        if(school[i][j].equals(satVerbal))
        {
          count++;
        }
        if(school[i][j].equals(satMath))
        {
          count++;
        }
        if(school[i][j].equals(expenses))
        {
          count++;
        }
        
        if(school[i][j].equals(financialAid))
        {
          count++;
        }
        if(school[i][j].equals(numberOfApplicants))
        {
          count++;
        }
        if(school[i][j].equals(admitted))
        {
          count++;
        }
        
        if(school[i][j].equals(enrolled))
        {
          count++;
        }
        if(school[i][j].equals(academicScale))
        {
          count++;
        }
        if(school[i][j].equals(socialScale))
        {
          count++;
        }
        
        if(school[i][j].equals(qualityOfLifeScale)) 
        { 
          count++;
        }
      }
      
      results[i][0] = school[i][0];
      results[i][1] = Integer.toString(count);
      //System.out.println(results[i][0] + " " + results[i][1]);
    }
    int somethingCounter = 0;
    
    for(Integer matchResults = 18; matchResults > 0; matchResults--)
    {
      
      for (int x = 0; x < results.length; x++)
      {
        //System.out.println(results[x][0]);
        if (results[x][1].equals(Integer.toString(matchResults)))
        {
//          System.out.println(results[x][0]);
//          printr[somethingCounter][0] = results[x][0];
//          printr[somethingCounter][1] = results[x][1];
//          somethingCounter++;
          schoolInfo.add(results[x][0]);
          if(schoolInfo.size() == 5)
            return schoolInfo;
        } 
      }
    }
    
    return schoolInfo;
  }
}