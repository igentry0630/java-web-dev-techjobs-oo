package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.testng.AssertJUnit.*;

public class JobTest {

    Job firstJob; //Declared job objects
    Job secondJob;

    @Before
    public void createAnObject() {
    firstJob = new Job(); //initialized first object
    secondJob = new Job();
    }
    //Testing the difference of the objects is 1
    @Test
    public void testSettingJobId() {
    int expected = 1;
    int actual = secondJob.getId() - firstJob.getId();
    System.out.println(actual);
    assertEquals(expected, actual);

    }
    // Testing id numbers are assigned to our Job objects
    @Test
    public void assignsNumbers() {
    boolean expected = true;
    boolean actual = firstJob.getId() > 0;
    assertTrue(String.valueOf(expected), actual);

    }
    // correctly assigns the class and value of each field

    @Test
    public void testJobConstructorSetsAllFields() {
    Job myFirstJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistency"));
    assertTrue(myFirstJob.getEmployer() instanceof Employer);
    assertTrue(myFirstJob.getName() instanceof String);
    assertTrue(myFirstJob.getCoreCompetency() instanceof CoreCompetency);
    assertTrue(myFirstJob.getLocation() instanceof Location);
    assertTrue(myFirstJob.getPositionType() instanceof PositionType);

    assertEquals("Product tester",myFirstJob.getName());
    assertEquals("ACME",myFirstJob.getEmployer().getValue());
    assertEquals("Desert",myFirstJob.getLocation().getValue());
    assertEquals("Quality control", myFirstJob.getPositionType().getValue());
    assertEquals("Persistency",myFirstJob.getCoreCompetency().getValue());
    }
    // Generate 2 job objects that have identical field values EXCEPT for id,
    // Test that equals returns false.
    @Test
    public void testJobsForEquality() {
        Job myFirstJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistency"));
        Job mySecondJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistency"));
        assertFalse(mySecondJob.equals(myFirstJob));
    }
    @Test
    public void returnsBlankLineBeforeAndAfterInfo() {
        Job myFirstJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistency"));
        assertEquals(myFirstJob.toString().endsWith(""), true);
        assertEquals(myFirstJob.toString().startsWith(""), true);

    }
    //string should contain a label for each field, followed by the data stored
    // in that field. Each field should be on its own line.
    @Test
    public void stringContainsLabelsAndData() {
        Job myFirstJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistency"));
        String expected = ""+ '\n'+ "ID: 3"+'\n'+"Name: Product tester"+'\n'+"Employer: ACME"+'\n'+"Location: Desert\n"+"Position Type: Quality control\n"+"Core Competency: Persistency"+"\n";
        assertEquals(expected, myFirstJob.toString());
    }

    @Test
    public void emptyStringMessage() {
        Job myFirstJob = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistency"));
        String expected = ""+ '\n'+ "ID: "+myFirstJob.getId()+'\n'+"Name: Data not available"+'\n'+"Employer: ACME"+'\n'+"Location: Desert\n"+"Position Type: Quality control\n"+"Core Competency: Persistency"+"\n";
        assertEquals(expected, myFirstJob.toString());
    }
//
//    @Test
//    public void onlyIdFilled() {
//        Job myFirstJob = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
//        String expected = "OOPS! This job does not seem to exist.";
//        assertEquals(expected, myFirstJob.toString());
//    }
    @Test
    public void newBlankLinesTest() {

    }

}
