package controller;

import java.util.ArrayList;

import dblibrary.project.csci230.UniversityDBLibrary;

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
    Integer count = 0;
    Integer p = 0; //counts parameters passed
    if(universityName != null && !universityName.equals(""))
    {
      p++;
    }
    if(state != null && !state.equals(""))
    {
      p++;
    }
    if(location != null && !location.equals(""))
    {
      p++;
    }
    
    if(control != null && !control.equals(""))
    {
      p++;
    }
    if(numberOfStudents != null && !numberOfStudents.equals(""))
    {
      p++;
    }
    if(female != null && !female.equals(""))
    {
      p++;
    }
    if(satVerbal != null && !satVerbal.equals(""))
    {
      p++;
    }
    if(satMath != null && !satMath.equals(""))
    {
      p++;
    }
    if(expenses != null && !expenses.equals(""))
    {
      p++;
    }
    
    if(financialAid != null && !financialAid.equals(""))
    {
      p++;
    }
    if(numberOfApplicants != null && !numberOfApplicants.equals(""))
    {
      p++;
    }
    if(admitted != null && !admitted.equals(""))
    {
      p++;
    }
    
    if(enrolled != null && !enrolled.equals(""))
    {
      p++;
    }
    if(academicScale != null && !academicScale.equals(""))
    {
      p++;
    }
    if(socialScale != null && !socialScale.equals(""))
    {
      p++;
    }
    
    if(qualityOfLifeScale != null && !qualityOfLifeScale.equals("")) 
    {
      p++;
    }
    
    //String[][] empArr = dblib.university_getNamesWithEmphases();
    for(int i =0 ; i < school.length; i++)
    {
      count = 0;
      //for(int j = 0; j < 16; j++)
      //{
        if(school[i][0].contains(universityName) && !universityName.equals("") && !universityName.equals(null))
        {
          count++;
        }
        if(school[i][1].equals(state) && !state.equals("") && !state.equals(null))
        {
          count++;
        }
        if(school[i][2].equals(location) && !location.equals("") && !location.equals(null))
        {
          count++;
        }
        if(school[i][3].equals(control) && !control.equals("") && !control.equals(null))
        {
          count++;
        }
        if(school[i][4].equals(numberOfStudents) && !numberOfStudents.equals("") && !numberOfStudents.equals(null))
        {
          count++;
        }
        if(school[i][5].equals(female) && !female.equals("") && !female.equals(null))
        {
          count++;
        }
        if(school[i][6].equals(satVerbal) && !satVerbal.equals("") && !satVerbal.equals(null))
        {
          count++;
        }
        if(school[i][7].equals(satMath) && !satMath.equals("") && !satMath.equals(null))
        {
          count++;
        }
        if(school[i][8].equals(expenses) && !expenses.equals("") && !expenses.equals(null))
        {
          count++;
        }
        if(school[i][9].equals(financialAid) && !financialAid.equals("") && !financialAid.equals(null))
        {
          count++;
        }
        if(school[i][10].equals(numberOfApplicants) && !numberOfApplicants.equals("") && !numberOfApplicants.equals(null))
        {
          count++;
        }
        if(school[i][11].equals(admitted) && !admitted.equals("") && !admitted.equals(null))
        {
          count++;
        }
        if(school[i][12].equals(enrolled) && !enrolled.equals("") && !enrolled.equals(null))
        {
          count++;
        }
        if(school[i][13].equals(academicScale) && !academicScale.equals("") && !academicScale.equals(null))
        {
          count++;
        }
        if(school[i][14].equals(socialScale) && !socialScale.equals("") && !socialScale.equals(null))
        {
          count++;
        }
        if(school[i][15].equals(qualityOfLifeScale) && !qualityOfLifeScale.equals("") && !qualityOfLifeScale.equals(null)) 
        { 
          count++;
        }
               
      
      
      results[i][0] = school[i][0];
      results[i][1] = Integer.toString(count);
      //System.out.println(results[i][0] + " " + results[i][1]);
    }
    //for(Integer matchResults = 18; matchResults > 0; matchResults--)
    //{
      
      for (int x = 0; x < results.length; x++)
      {
        //System.out.println(results[x][0]);
        if (results[x][1].equals(Integer.toString(p)))
        {
//          System.out.println(results[x][0]);
//          printr[somethingCounter][0] = results[x][0];
//          printr[somethingCounter][1] = results[x][1];
//          somethingCounter++;
          schoolInfo.add(results[x][0]);
          
          
        } 
      }
    //}
    
    return schoolInfo;
  }
}