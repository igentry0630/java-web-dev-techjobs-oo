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
}
