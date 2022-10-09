package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

     @Test
     public void testSettingJobId(){
         Job testjob1 = new Job();
         Job testjob2 = new Job();
         assertNotEquals(testjob1.getId(),testjob2.getId());

     }
    @Test
     public void testJobConstructorSetsAllFields(){
        Employer employer;
        Location location;
        PositionType positionType;
        CoreCompetency coreCompetency;
      Job testjob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
         assertEquals("Product tester",testjob.getName());
        // System.out.println(testjob.getName());
         assertEquals("ACME",testjob.getEmployer().getValue());
         //System.out.println(testjob.getEmployer());
         //System.out.println(testjob.getEmployer().getValue());
         assertEquals("Desert",testjob.getLocation().getValue());
         assertEquals("Quality control",testjob.getPositionType().getValue());
         assertEquals("Persistence",testjob.getCoreCompetency().getValue());
         assertTrue(testjob instanceof Job);
         assertTrue(testjob.getEmployer() instanceof Employer);
         assertTrue(testjob.getLocation() instanceof Location);
         assertTrue(testjob.getPositionType() instanceof PositionType);
         assertTrue(testjob.getCoreCompetency() instanceof CoreCompetency);
         //System.out.println(testjob instanceof Job);
        //System.out.println(testjob.getEmployer() instanceof Employer);
    }

@Test
    public void testJobsForEquality(){
    Job testjob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job testjob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(testjob1.equals(testjob2));
   // System.out.println(testjob1);
   // System.out.println(testjob2);
}
@Test
public void  testToStringStartsAndEndsWithNewLine(){
    Job testjob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
   // System.out.println(testjob.toString());
   // System.out.println(testjob.toString().charAt(112));
   // assertEquals('N',testjob.toString().charAt(6));
    int lastIndex = testjob.toString().length()-1;
    assertEquals('\n',testjob.toString().charAt(0));
    assertEquals('\n',testjob.toString().charAt(lastIndex));

}
@Test
    public void testToStringContainsCorrectLabelsAndData(){
    Job testjob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    //System.out.println(testjob.toString().contains("Desert"));
    String output = "\n" + "ID:" + testjob.getId() + "\n" + "Name:"+testjob.getName() + "\n" + "Employer:" + testjob.getEmployer() + "\n" + "Location:" + testjob.getLocation() +"\n" + "PositionType:" +testjob.getPositionType() + "\n" + "CoreCompetency:" + testjob.getCoreCompetency() + "\n";
    assertEquals(output,testjob.toString());

}
@Test
    public void testToStringHandlesEmptyField(){

    Job testjob = new Job("",new Employer(), new Location(), new PositionType(), new CoreCompetency());
    String output = "\n" + "ID:" + testjob.getId() + "\n" + "Name:Data not available" + "\n" + "Employer:Data not available"+ "\n" + "Location:Data not available" +"\n"
            + "PositionType:Data not available" + "\n" + "CoreCompetency:Data not available" + "\n";
    System.out.println(output);
    assertEquals(output,testjob.toString());
}
}
