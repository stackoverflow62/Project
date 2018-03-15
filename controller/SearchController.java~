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

public class SearchController{
  
  private UniversityDBLibrary dblib;
  String universityName;
  private String state;
  private String locationType;//Urban, Rural,etc
  private String control;//whether school is private or public
  private int numberOfStudents;
  private double female;//percentage of female students in the university
  private double satVerbal;
  private double satMath;
  private double expenses;
  private double financialAid;
  private int numOfApplicants;
  private double numAdmitted;
  private double enrolled;
  private int academicScale;
  private int socialScale;
  private int qualityOfLife;
  
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