package controller;

import java.util.ArrayList;

import dblibrary.project.csci230.UniversityDBLibrary;
import entity.Account;
import entity.University;

/**
 * This class is the Database controller that allows a user to access the database and change things.
 *
 * First version- Ramon Angeles
 * 
 * @author J. Ramon Angeles, James Heidelberger, Jaime Vega, Jonathan First, Vue Xiong
 * @version February 2018
 */

public class DatabaseController{
  
  UniversityDBLibrary dblib;
 
  
  /**
   * Default Constructor
   */
  public DatabaseController(){
    dblib = new UniversityDBLibrary("stacko", "csci230");
  }
  
  /**
   * Allows the Admin to add a new university to the database
   * 
   * @param university the name of the university that is to be added
   * 
   * @return true if university is added, false otherwise
   */
  public boolean addUniversity(University university){
    int addFailed = 0;
    int failed = dblib.university_addUniversity(university.getUniversityName(), university.getUniversityState(), university.getLocationType(), university.getControl(), (int)university.getNumOfStudents(),
                                                university.getFemalePercentage(), university.getSATVerbal(), university.getSATMath(), university.getExpenses(), 
                                                university.getFinancialAid(), university.getNumApplicants(), university.getNumAdmitted(), university.getNumEnrolled(),
                                                university.getAcademicScale(), university.getSocialScale(), university.getQualityOfLife());
    ArrayList<String> addArray = university.getEmphases();
    for(int i=0; i < addArray.size(); i++){
      addFailed = dblib.university_addUniversityEmphasis(university.getUniversityName(), addArray.get(i));
    }
    if(failed != -1 && addFailed != -1){
      return true;
    }
    return false;
  }
  /**
   * Allows the admin to edit a university in the database.
   * 
   * @param university the name of the university that is to be edited
   * 
   * @return true if the edits were made, false otherwise
   */
  public boolean editUniversity(University university){
    String[][] array = dblib.university_getNamesWithEmphases();
    ArrayList<String> oldArray = new ArrayList<String>();
    int updateFailed = 0;
    int failed = dblib.university_editUniversity(university.getUniversityName(), university.getUniversityState(), university.getLocationType(), university.getControl(), (int)university.getNumOfStudents(),
                                                 university.getFemalePercentage(), university.getSATVerbal(), university.getSATMath(), university.getExpenses(), 
                                                 university.getFinancialAid(), university.getNumApplicants(), university.getNumAdmitted(), university.getNumEnrolled(),
                                                 university.getAcademicScale(), university.getSocialScale(), university.getQualityOfLife());  
    if(failed != -1){
      return false;
    }
    for(int i =0 ; i < array.length; i++){
      if(array[i][0].equals(university.getUniversityName())){
        oldArray.add(array[i][0]);
      }
    }
//    if(oldArray != null){
//      for(int i = 0; i < oldArray.size(); i++){
//        dblib.university_removeUniversityEmphasis(university.getUniversityName(), oldArray.get(i));
//      }
//    }
//    ArrayList<String> newArray = university.getEmphases();
//    for(int i = 0; i < newArray.size(); i++){
//      updateFailed = dblib.university_addUniversityEmphasis(university.getUniversityName(), newArray.get(i));
//    }
    
    if(updateFailed != -1){
      return true;
    }
    return false;
    
  }
  /**
   * Allows the admin to edit a user's information.
   * 
   * @param account the name of the users account
   * 
   * @return true if the edits were made, false otherwise
   */
  public boolean editUser(Account account){
    //int failed = dblib.user_editUser(account.getFirstName(), account.getLastName(), account.getUsername(), account.getPassword(),
                               //      account.getType(), account.getStatus());
    //(firstName, lastName, username, password, charType)
    if(dblib.user_editUser(account.getUsername(), account.getFirstName(), account.getLastName(), account.getPassword(),
            account.getType(), account.getStatus()) == 1)
      return true;
    else
      return false;    
  }
  /**
   * Allows the student to save a universtiy to their list.
   * 
   * @param username the username of the student 
   * @param schoolName the name of the university the student wants to add to their list
   * 
   * @return true if the university was added, false otherwise
   */
  public boolean saveUniversity(String username, String schoolName)
  {
   int failed = dblib.user_saveSchool(username, schoolName);
   if(failed != -1)
     return true;
   else{
     return false;}
  }
 /**
  * Allows the admin to get all the users.
  */
  public String[][] getUsers()
  {
    return dblib.user_getUsers();
  }
  /**
   * This allows the admin delete a university from the database.
   * 
   * @param name the name of the university that the Admin wants to delete
   * 
   * @return true if it was delted, false otherwise
   */ 
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
      System.out.println(school[i][0]);
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
  public void getUniversities() {
	  String[][] array = dblib.university_getUniversities();
	  for(int i = 0; i < array.length; i++) {
		  System.out.println(array[i][0]);
	  }
  }
  public boolean addUser(String firstName, String lastName, String username, String password, char charType)
  {
    dblib.user_addUser(firstName, lastName, username, password, charType);
    return true;
  }
  
  public boolean login(String username, String password)
  {
    String[][] users = dblib.user_getUsers();
    for(int i = 0; i < users.length; i++)
    {
    	//System.out.println(users[i][2]  + " " + users[i][3] + " " + users[i][5] + " " + users.length);
    	
     if (users[i][2].equals(username) )//&& users[i][3].equals(password) )//&& users[i][5].equals("Y"))
     {
    	 if(users[i][3].equals(password)) {
    		 if(users[i][5].equals("Y")) {
    			 return true;
    	 }
    		 else {
    			System.out.println("You are not Active. Please contact Administration to proceed");
    			return false;
    		 }
         }
    	 else {
    		 System.out.println("Incorrect Password. Please Try Again");
    		 return false;
    	 }
    }
     
}
    System.out.println("Username does not exist. Contract Administration to proceed");
    return false;
    }
    //return false;
  public ArrayList<String> getEmphasis(String u) {
	  String[][] emphasis = dblib.university_getNamesWithEmphases();
	  ArrayList<String> majors = new ArrayList<String>();
	  for(int i = 0; i < emphasis.length; i++) {
		  if(emphasis[i][0].equals(u)) {
			  for(int x=0; x< emphasis[i].length; x++) {
				  majors.add(emphasis[i][x]);
			  }
		  }
	  }
	  return majors;
  }
  public void getRecommendedSchools(University u)
  {
	ArrayList<String> recommendedSchools = new ArrayList<String>();
	int numberOfStudentsMAX = 0;
	int numberOfStudentsMIN = 50000;
	double percentageFemaleMAX = 0;
	double percentageFemaleMIN = 100.0;
	double SATmathMAX = 0;
	double SATmathMIN = 1600;
	double SATverbalMAX = 0;
	double SATverbalMIN = 1600;
	double expensesMAX = 0;
	double expensesMIN = 1000000000;
	double financialAidMAX = 0;
	double financialAidMIN = 100.0;
	int numberOfApplicantsMAX = 0;
	int numberOfApplicantsMIN = 1000000;
	double percentAdmittedMAX = 0;
	double percentAdmittedMIN = 100.0;
	double percentEnrolledMAX = 0;
	double percentEnrolledMIN = 100.0;
	int academicScaleMAX = 5;
	int academicScaleMIN = 1;
	int socialScaleMAX = 5;
	int socialScaleMIN = 1;
	int lifeScaleMAX = 5;
	int lifeScaleMIN = 1;
	
	String[][] universities = dblib.university_getUniversities();
	String[][] emphasis = dblib.university_getNamesWithEmphases();
	String[][] distances = new String[universities.length][2];
	Double distance = 0.0;
	
	
	for (int i = 0; i<universities.length; i++) {
		for(int j = 0; j< universities[i].length; j++)
		{
			if(j == 4)
			{
				if (numberOfStudentsMAX < Integer.parseInt(universities[i][j]))
				{
					numberOfStudentsMAX = Integer.parseInt(universities[i][j]);
				}
				if (numberOfStudentsMIN > Integer.parseInt(universities[i][j]))
				{
					numberOfStudentsMIN = Integer.parseInt(universities[i][j]);
				}
			}
			if(j == 5)
			{
				if (percentageFemaleMAX < Double.parseDouble(universities[i][j]))
				{
					percentageFemaleMAX = Double.parseDouble(universities[i][j]);
				}
				if (percentageFemaleMIN > Double.parseDouble(universities[i][j]))
				{
					percentageFemaleMIN = Double.parseDouble(universities[i][j]);
				}
			}
			if(j == 6)
			{
				if (SATverbalMAX < Double.parseDouble(universities[i][j]))
				{
					SATverbalMAX = Double.parseDouble(universities[i][j]);
				}
				if (SATverbalMIN > Double.parseDouble(universities[i][j]))
				{
					SATverbalMIN = Double.parseDouble(universities[i][j]);
				}
			}
			if(j == 7)
			{
				if (SATmathMAX < Double.parseDouble(universities[i][j]))
				{
					SATmathMAX = Double.parseDouble(universities[i][j]);
				}
				if (SATmathMIN > Double.parseDouble(universities[i][j]))
				{
					SATmathMIN = Double.parseDouble(universities[i][j]);
				}
			}
			if(j == 8)
			{
				if (expensesMAX < Double.parseDouble(universities[i][j]))
				{
					expensesMAX = Double.parseDouble(universities[i][j]);
				}
				if (expensesMIN > Double.parseDouble(universities[i][j]))
				{
					expensesMIN = Double.parseDouble(universities[i][j]);
				}
			}
			if(j == 9)
			{
				if (financialAidMAX < Double.parseDouble(universities[i][j]))
				{
					financialAidMAX = Double.parseDouble(universities[i][j]);
				}
				if (financialAidMIN > Double.parseDouble(universities[i][j]))
				{
					financialAidMIN = Double.parseDouble(universities[i][j]);
				}
			}
			if(j == 10)
			{
				if (numberOfApplicantsMAX < Integer.parseInt(universities[i][j]))
				{
					numberOfApplicantsMAX = Integer.parseInt(universities[i][j]);
				}
				if (numberOfApplicantsMIN > Integer.parseInt(universities[i][j]))
				{
					numberOfApplicantsMIN = Integer.parseInt(universities[i][j]);
				}
			}
			if(j == 11)
			{
				if (percentAdmittedMAX < Double.parseDouble(universities[i][j]))
				{
					percentAdmittedMAX = Double.parseDouble(universities[i][j]);
				}
				if (percentAdmittedMIN > Double.parseDouble(universities[i][j]))
				{
					percentAdmittedMIN = Double.parseDouble(universities[i][j]);
				}
			}
			if(j == 12)
			{
				if (percentEnrolledMAX < Double.parseDouble(universities[i][j]))
				{
					percentEnrolledMAX = Double.parseDouble(universities[i][j]);
				}
				if (percentEnrolledMIN > Double.parseDouble(universities[i][j]))
				{
					percentEnrolledMIN = Double.parseDouble(universities[i][j]);
				}
			}	
		}
	}
	for(int x = 0; x<universities.length; x++)
	{
		distances[x][0] = universities[x][0];
		
		if(!u.getUniversityName().equals(universities[x][0]))
		{
			distance++;
		}
		if(!u.getUniversityState().equals(universities[x][1]))
		{
			distance++;
		}
		if(!u.getLocationType().equals(universities[x][2]))
		{
			distance++;
		}
		if(!u.getControl().equals(universities[x][3]))
		{
			distance++;
		}
		
		distance = distance + Math.abs(u.getNumOfStudents() - Integer.parseInt(universities[x][4]))/Math.abs(numberOfStudentsMAX-numberOfStudentsMIN)
				+ Math.abs(u.getFemalePercentage() -Double.parseDouble(universities[x][5]))/Math.abs(percentageFemaleMAX - percentageFemaleMIN)
				+ Math.abs(u.getSATVerbal() -Double.parseDouble(universities[x][6]))/Math.abs(SATverbalMAX - SATverbalMIN)
				+ Math.abs(u.getSATMath() -Double.parseDouble(universities[x][7]))/Math.abs(SATmathMAX - SATmathMIN)
				+ Math.abs(u.getExpenses() -Double.parseDouble(universities[x][8]))/Math.abs(expensesMAX - expensesMIN)
				+ Math.abs(u.getFinancialAid() -Double.parseDouble(universities[x][9]))/Math.abs(financialAidMAX - financialAidMIN)
				+ Math.abs(u.getNumApplicants() - Integer.parseInt(universities[x][10]))/Math.abs(numberOfApplicantsMAX-numberOfApplicantsMIN)
				+ Math.abs(u.getNumAdmitted() -Double.parseDouble(universities[x][11]))/Math.abs(percentAdmittedMAX - percentAdmittedMIN)
				+ Math.abs(u.getNumEnrolled() -Double.parseDouble(universities[x][12]))/Math.abs(percentEnrolledMAX - percentEnrolledMIN)
				+ Math.abs(u.getAcademicScale() - Integer.parseInt(universities[x][13]))/Math.abs(academicScaleMAX-academicScaleMIN)
				+ Math.abs(u.getSocialScale() - Integer.parseInt(universities[x][14]))/Math.abs(socialScaleMAX-socialScaleMIN)
				+ Math.abs(u.getQualityOfLife() - Integer.parseInt(universities[x][15]))/Math.abs(lifeScaleMAX-lifeScaleMIN);
				
		
		distances[x][1] = Double.toString(distance);
		distance = 0.0;
	}
	
	
	for(int y = 0; y <5; y++)
	{
		double minimum = 10000000;
		int index = 0;
		String name = "";
		for(int z = 0; z<distances.length; z++)
		{
			if(Double.parseDouble(distances[z][1]) < minimum  && Double.parseDouble(distances[z][1]) != 0.0)
			{
			  minimum = Double.parseDouble(distances[z][1]);
			  index = z;
			  name = distances[z][0];
			}
			
		}
		distances[index][1] = Double.toString(10000000.0);
		recommendedSchools.add(name);
	}
	for(String names: recommendedSchools)
	{
		System.out.println("\n");
		System.out.println(names);
	}
  }
}
  
  


