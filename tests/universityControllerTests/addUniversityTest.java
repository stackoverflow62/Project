package universityControllerTests;

import static org.junit.Assert.*;
import controller.*;
import entity.*;
import org.junit.Before;
import org.junit.Test;


public class addUniversityTest {
	UniversityController uc;
	@Before
	  public void setUp() throws Exception {
		uc = new UniversityController();
		String schoolName = "SAMPLE";
		String state = "MN";
		String location = "URBAN";
		String control = "PRIVATE";
		int numStudents = 300;
		double female = 55;
		double satVerb = 550;
		double satMath = 550;
		double expenses = 500;
		double finAid = 360;
		int numApplicants = 300;
		double numAdmitted = 4500;
		double numEnrolled = 5000;
		int acaScale = 20;
		int socScale = 15;
		int qualityLife = 10;
		
		uc.addUniversity("SapmleUniversity", "MN", "URBAN", "PUBlLIC", 10,
		        50, 530.0, 560.0, 580.0, 600.0, 3,
		        20, 30, 15, 16, 25);
	  }
	
	@Test
	public void testAddUniversity() {
		
		
		Univeristy sample = uc.getUniversty(schoolName);
	    assertEquals("Expected University Name is" + schoolName, schoolName, sample.getUniversityName());
		assertEquals("Expected  State is " + state, state, sample.getUniversityState());
		assertEquals("Expected  location is " + location, location, sample.getLocationType());
		assertEquals("Expected  is control is" + , , );
		assertEquals("Expected  is " + , , );
		
	}
	
	
	
}
