package entity;

import java.util.ArrayList;
/**
 * University Entity that stores all the information pertaining to a school.
 * 
 * 
 * 
 * From 2/25/18-2/26/18-->worked on by Vue Xiong
 * -->wrote the variables, the constructor and all the setter and getter methods
 * @author Ramon Angeles, Jonathan First, James H. , Jaime Vega, Vue Xiong
 * @version Feb 26, 2018
 */

public class University
{
  private String school;//name of school
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
  private ArrayList<String> emphases;//School Majors
  
  //Creates a list for the emphases a school has, which basically is a list of majors that is associated with a school. 
  // List emphases = new LinkedList-->Mayber NOt SURE
  
  /**
   * Constructor to create a new university with all the following information that a university should contain. 
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
   * @return a University object
   */
  
  public University(String school, String state,String locationType, String control, int numberOfStudents,double female,double satVerbal, 
                 double satMath,double expenses,double financialAid,int numOfApplicants, double numAdmitted, double enrolled, int academicScale,
                 int socialScale, int qualityOfLife)
  {
    this.school = school;
    this.state = state;
    this.locationType = locationType;
    this.control = control;
    this.numberOfStudents = numberOfStudents;
    this.female = female;
    this.satVerbal = satVerbal;
    this.satMath = satMath;
    this.expenses = expenses;
    this.financialAid = financialAid;
    this.numOfApplicants = numOfApplicants;
    this.numAdmitted = numAdmitted;
    this.enrolled = enrolled;
    this.academicScale = academicScale;
    this.socialScale = socialScale;
    this.qualityOfLife =qualityOfLife;
  //  this.emphases = emphases;
    
  }
//  public University()
//  {
//  }
  //***************************Setters methods for adding new school**************************************************
  /**
   * Sets the status whether the school is saved or not.
   * 
   * @param status the status of the school
   * @returns true if saved, otherwise false
   */
  public boolean setSavedStatus()
  {
    return true;
  }
  
  /**
   * To set the name of a university. 
   * 
   * @param schoolName the name of the school
   */
  public void setUniversityName(String schoolName)
  {
    this.school = schoolName;
  }
  
  /**
   * To set which state the school is located at.
   * 
   * @param state the state where the school is located
   */
  public void setUniversityState(String state)
  {
    this.state = state;
  }
  
  /**
   * To set the location type of the school
   * 
   * @param locationType the type of location where the school is located
   */
  public void setLocationType(String locationType)
  {
    this.locationType = locationType;
  }
 /**
  * To set whether the school is public or private.
  * 
  * @param control whether school is private or public
  */
  public void setControl(String control)
  {
    this.control = control;
  }
  /**
   * To set the number of students a school has.
   * 
   * @param numOfStudents the number of students attending the school.
   */
  public void setNumOfStudents(int numOfStudents)
  {
    this.numberOfStudents = numOfStudents;
  }
  
  /**
   * To set perecentage of female students at a university.
   * 
   * @parm femalePercent the percentage of female student a a school.
   */
  public void setFemalePercent(double femalePercent)
  {
    this.female = femalePercent;
  }
  
  /**
   * To set SATVerbal scores. 
   * 
   * @param satVerbal the average SATVerbal score of the school. 
   */
  public void setSATVerbal(double satVerbal)
  {
    this.satVerbal = satVerbal;
  }
  
  /**
   * To set the SATMath scores.
   * 
   * @param satMath the average SATMath score of the school. 
   */
  public void setSATMath(double satMath)
  {
    this.satMath = satMath;
  }
  
  /**
   * To set the expenses/cost of a school.
   * 
   * @param expenses the cost/expenses that each school requires/suggest for attending the school.
   */
  public void setExpenses(double expenses)
  {
    this.expenses = expenses;
  }
  
  /**
   * To set the financial aid offer by the school. 
   * 
   * @param fifnanAid the average financial aid the school offers to its enrolled and admitted students. 
   */
  public void setFinancialAid(double finanAid)
  {
    this.financialAid = finanAid;
  }
  
  /**
   * To set the number of applicants that the school has.
   * 
   * @param numApplicants the number of applicants that applies/applied to the school
   */
  public void setNumApplicants(int numApplicants)
  {
    this.numOfApplicants = numApplicants;
  }
  
  /**
   * To set the number of addmitted students for a school.
   * 
   * @param numAdmitted the number of students admitted into the school
   */
  public void setNumAdmitted(double numAdmitted)
  {
    this.numAdmitted = numAdmitted;
  }
  
  /**
   * To set the number of students enrolled into the school
   * 
   * @param numEnrolled the number of students who are enrolled in a school
   */
  public void setNumEnrolled(double numEnrolled)
  {
    this.enrolled = numEnrolled;
  }
  
  /**
   * To set the academic scale for a school.
   * 
   * @param academicScale to the school.
   */
  public void setAcademicScale(int academicScale)
  {
    this.academicScale = academicScale;
  }
  
  /**
   * To set the social scale of a school.
   * 
   * @param socialScale the social scale of a school/
   */
  public void setSocialScale(int socialScale)
  {
    this.socialScale = socialScale;
  }
  
  /**
   * To set the quality of life on a school.
   * 
   * @param qualityOfLife the quality of life for a student at a school.
   */
  public void setQualityOfLife(int qualityOfLife)
  {
    this.qualityOfLife = qualityOfLife;
  }
  
  /**
   * To set the emphases of a school. Sets a list of majors the school has to offer. 
   * 
   * @param schoolName the name of school 
   * @param emphases the emphases of a school
   */
  public void setEmphases(String schoolName, ArrayList<String> emphases)
  {
    this.emphases = emphases;
  }
  
 //*******Getter methods that allows the user/admin to get an association with the school they are looking at*********
  
  /**
   * Allows the user to get the name of the school.
   * 
   * @retruns the name of the school. 
   */
  public String getUniversityName()
  {
    return this.school;
  }
  
  /**
   * Allows the user to get which state the school is in.
   * 
   * @returns the state that the school is in. 
   */
  public String getUniversityState()
  {
    return this.state;
  }
  
  /**
   * Allows the user to get the location type of a school, whethere Ubran, Rural, etc. 
   * 
   * @returns the location type of a school
   */
  public String getLocationType()
  {
    return this.locationType;
  }
  /**
   * Allows the user to get whether the school is public or private
   * 
   * @returns whether the school is private or public
   */
  public String getControl()
  {
    return this.control;
  }
  
  /**
   * Allows the user to get the number of students at a school.
   * 
   * @return the number of students at a school. 
   */
  public int getNumOfStudents()
  {
    return this.numberOfStudents;
  }
  
  /**
   * Allows the user to get the percentage of female students at a school.
   * 
   * @returns the percentage of female student at a school 
   */
  public double getFemalePercentage()
  {
    return this.female;
  }
 /**
 *  Allows the user to get the SAT verbal scores of a school.
 * 
 * @returns the SAT verabl score of a school 
 */
  public double getSATVerbal()
  {
    return this.satVerbal;
  }
  
  /**
   * Allows the user to get the SAT Math scores of a school
   * 
   * @returns the SAT Math score of a school
   */
  public double getSATMath()
  {
    return this.satMath;
  }
  
  /**
   * Allows user to get the expenses of a school
   * 
   * @returns the expenses for a school
   */
  public double getExpenses()
  {
    return this.expenses;
  }
  
  /**
   * Allows user to get the financial aid for a school
   * 
   * @returns the financial aid offer for a school
   */
  public double getFinancialAid()
  {
    return this.financialAid;
  }
  
  /**
   * Allows the user to get the number of applicants for each school
   * 
   * @returns the number of applicant for a school
   */
  public int getNumApplicants()
  {
    return this.numOfApplicants;
  }
  
  /**
   * Get number of students admitted at a school
   * 
   * @returns the number of students admitted at a school 
   */
  public double getNumAdmitted()
  {
    return this.numAdmitted;
  }
  
    
  /**
   * Get number of students enrolled at a school
   * 
   * @returns the number of students enrolled at a school 
   */
  public double getNumEnrolled()
  {
    return this.enrolled;
  }
  
    
  /**
   * Get academic scale of a school
   * 
   * @returns the academic scale of a school 
   */
  public int getAcademicScale()
  {
    return this.academicScale;
  }
  
    /**
   * Get social scale of a school
   * 
   * @returns the social scale of a school 
   */
  public int getSocialScale()
  {
    return this.socialScale;
  }
  
    /**
   * Get the quality of life of a school
   * 
   * @returns the quality of life of a school 
   */
  public int getQualityOfLife()
  {
    return this.qualityOfLife;
  }
  
   /**
   * Get Emphases/majors of a school
   * 
   * @returns a lis tof emphases/majors of a school 
   */
  public ArrayList<String> getEmphases()
  {
    return this.emphases;
  }
}
  